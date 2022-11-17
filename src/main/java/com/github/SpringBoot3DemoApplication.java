package com.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
public class SpringBoot3DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot3DemoApplication.class, args);
    }

}
