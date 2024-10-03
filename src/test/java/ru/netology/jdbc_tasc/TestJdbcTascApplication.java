package ru.netology.jdbc_tasc;

import org.springframework.boot.SpringApplication;

public class TestJdbcTascApplication {

    public static void main(String[] args) {
        SpringApplication.from(JdbcTascApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
