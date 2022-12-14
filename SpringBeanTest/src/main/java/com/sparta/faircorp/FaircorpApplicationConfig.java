package com.sparta.faircorp;

import com.sparta.hello.GreetingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FaircorpApplicationConfig {

    @Bean
    public CommandLineRunner GreetingCommandLine (GreetingService gs) {
        return args -> {
            gs.greet("Spring");
        };
    }
}
