package com.example.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    // s
    @Bean
    protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        System.out.println("building http");
        http
            .authorizeRequests(authorizeRequests ->
                    authorizeRequests.anyRequest().permitAll()
            )
                .csrf(csrf -> csrf.disable()); // Disable CSRF protection if not needed

        return http.build();
    }
}
