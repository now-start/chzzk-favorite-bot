# Chzzk-favorite-bot
[![Build and Push Docker Image](https://github.com/now-start/chzzk-favorite-bot/actions/workflows/build.yaml/badge.svg)](https://github.com/now-start/chzzk-favorite-bot/actions/workflows/build.yaml)

https://chzzk.nowstart.org

## dependency
- Chzzk API
  - chzzk4j:0.0.9
- Security
  - jasypt-spring-boot-starter:3.0.5
  - spring-boot-starter-security
- Repository
  - spring-boot-starter-data-jpa
  - spring-cloud-starter-openfeign
- Admin Page
  - spring-boot-starter-web
  - spring-boot-starter-actuator
  - spring-boot-admin-starter-server
  - spring-boot-admin-starter-client

## Enviromnet
| key                      | value(default)                | describe            | required |
|--------------------------|------------------------|---------------------|----------|
| SERVER_BASE_URL           | `http://localhost:8080`| base_url            | O        |
| jasypt.encryptor.password | ``                     | Encrypt Password    | O        |
| chzzk.channelId           | ``                     | Apply Channel       | O        |
| chzzk.aut                 | ``                     | Bot Authenticated   | O        |
| chzzk.ses                 | ``                     | Bot Session         | O        |
