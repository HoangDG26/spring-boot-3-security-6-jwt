package com.orijon.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SecurityApplication {
    private static final Logger logger = LoggerFactory.getLogger(SecurityApplication.class);
    @Value("${server.port}")
    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SecurityApplication.class, args);
        Environment env = context.getEnvironment();
        logger.info("Server listening on http://localhost:"+env.getProperty("server.port")+"/swagger-ui/index.html#/");

    }

}
