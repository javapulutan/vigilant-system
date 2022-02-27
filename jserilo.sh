#!/bin/sh

./mvnw spring-boot:run -Dspring-boot.run.arguments="--spring.datasource.url=$DATABASE_URL"
