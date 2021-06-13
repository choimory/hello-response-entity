package com.practice.helloresponseentity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/employee/**")
                .allowedOrigins("http://localhost:8080"
                                , "https://localhost:443") //도메인 뒤에 /를 붙이면 적용 안되는것에 주의
                .allowedMethods("*")
                .maxAge(3000L);
    }
}
