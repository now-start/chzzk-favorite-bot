package org.nowstart.nyangnyangbot.config;

import java.util.Map;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.nowstart.nyangnyangbot.command.Command;
import org.springframework.stereotype.Component;
import xyz.r2turntrue.chzzk4j.chat.ChatEventListener;
import xyz.r2turntrue.chzzk4j.chat.ChatMessage;
import xyz.r2turntrue.chzzk4j.chat.ChzzkChat;

@Slf4j
@Component
@RequiredArgsConstructor
public class ChzzkChatListenerConfig implements ChatEventListener {

    private ChzzkChat chzzkChat;
    private final Map<String, Command> commands;

    @Override
    public void onConnect(ChzzkChat chzzkChat, boolean isReconnecting) {
        this.chzzkChat = chzzkChat;
    }

    @Override
    public void onChat(ChatMessage msg) {
        Command command = commands.get(msg.getContent().split(" ")[0]);
        if (command != null) {
            log.info("[Commend] : {}", msg);
            command.execute(chzzkChat, msg);
        }
    }
}