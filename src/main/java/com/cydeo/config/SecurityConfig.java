package com.cydeo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

// If you are only creating a Bean,one object on other word is just basic bean. You can write it on runner class which is contain @SpringBootApplication annotation
// If you need bounch of modification or complex beans then you better need to put it in the config calss.
@Configuration
public class SecurityConfig {

    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder encoder){

    }
}
