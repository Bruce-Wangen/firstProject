package com.example.demo.config.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebAppConfiguration implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        System.out.println("222");
        registry.addMapping("/**") // 所有接口
                .allowedOrigins("http://127.0.0.1:8080") // 允许这个地址访问
                .allowedMethods("GET", "POST")
                .allowCredentials(false).maxAge(3600);

    }


}

