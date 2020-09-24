#! /bin/sh
java -jar target/billrun-0.0.1.jar \
--spring.datasource.url=jdbc:mysql://localhost:3306/task?useSSL=false \
--spring.datasource.username=root \
--spring.datasource.password=password \
--spring.datasource.driverClassName=com.mysql.jdbc.Driver \
--spring.datasource.initialization-mode=always \
--spring.batch.initialize-schema=always