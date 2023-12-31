package br.com.ifms.projeto.gerenciamento.evento.crud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SecurityConfig {

        @Bean
        public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
                http.csrf(csrf -> csrf.disable());
                http.authorizeHttpRequests(auth -> auth
                                .requestMatchers(AntPathRequestMatcher.antMatcher(""))
                                        .permitAll().anyRequest().permitAll());
                http.headers(headers -> headers.frameOptions().disable());
                return http.build();
        }
        
}
