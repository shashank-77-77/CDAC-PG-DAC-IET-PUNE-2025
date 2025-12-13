# TravelBooking - Spring Boot (MySQL)

This is a minimal Spring Boot 3.2.0 application (Java 17) using Thymeleaf and MySQL.

## Prerequisites
- Java 17 JDK
- Maven
- MySQL server with a database named `shadb` and user `root`/`root` (or update application.properties accordingly)

Create the database before running:
```
CREATE DATABASE shadb;
```

## Run
From project root:
```
mvn clean package
mvn spring-boot:run
```

Open http://localhost:8080/bookings

Notes:
- The application uses `spring.jpa.hibernate.ddl-auto=update` so tables will be created automatically.
- If port 8080 is busy, change `server.port` in `application.properties`.
