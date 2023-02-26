# Spring Boot Admin

Monitorización de microservicios con spring boot admin


## Authors

- [@yorsh](https://github.com/dev-yorsh)


## Appendix

Este repositorio consta de un proyecto servidor (Spring Boot Admin) encargado de recolectar las métricas, procesarlas y mostrar en una interfaz de usuario. Y a su vez dos clientes que enviaran sus metricas hacia el servidor de monitoreo.

**boot-admin-server**: Proyecto encargado de recolectar las métricas.
**cliente-backend**: Envia metricas(actuator, logs, caché) al servidor de metricas.
**producto-backend**: Envia metricas(actuator, logs, caché) al servidor de metricas.


## Features

- Spring Cache
- HazelCast (Cache)
- Spring Data
- Actuator
- PostgreSQL
- Lombok
- Monitoreo: actuator, logs, caché
- Gradle
- Maven


## Environment Variables

Para ejecutar este proyecto, deberá agregar las siguientes variables de entorno a su archivo de configuracion (yml)

`USERNAME`

`PASSWORD`


## Installation

Instalar / Actualizar las dependencias con maven y gradle.

```bash
  > cd my-project
  > ./gradlew build --refresh-dependencies  #Gradle
  >  mvn clean install  #Maven
```

## Ejecucion

```bash
  >./gradlew bootRun  #Gradle
  > mvn spring-boot:run  #Maven
```
    
## Screenshots

- Spring-Boot-Admin
![App Screenshot](https://github.com/dev-yorsh/repository-images/blob/main/spring-boot-admin/Spring-Boot-Admin.png?raw=true)

<br>

- Dashboard
![App Screenshot](https://github.com/dev-yorsh/repository-images/blob/main/spring-boot-admin/Dashboard.png?raw=true)

<br/>

- Metricas
![App Screenshot](https://github.com/dev-yorsh/repository-images/blob/main/spring-boot-admin/Metricas.png?raw=true)

<br/>

- Endpoints
![App Screenshot](https://github.com/dev-yorsh/repository-images/blob/main/spring-boot-admin/Endpoints.png?raw=true)

<br/>

- Logging
![App Screenshot](https://github.com/dev-yorsh/repository-images/blob/main/spring-boot-admin/Logging.png?raw=true)

<br/>

- Cache
![App Screenshot](https://github.com/dev-yorsh/repository-images/blob/main/spring-boot-admin/Cache.png?raw=true)

<br/>

## 🚀 About Me
- I'm a full stack developer :D

