package com.sparta.hello;

import org.springframework.context.annotation.Bean;

public interface GreetingService {
    @Bean
    void greet(String name);
}
