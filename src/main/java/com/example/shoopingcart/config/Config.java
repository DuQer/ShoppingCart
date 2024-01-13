package com.example.shoopingcart.config;

import com.example.shoopingcart.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class Config {
    private final UserRepository userRepository;

}
