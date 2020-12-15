package com.example.securingweb;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
// WebMvcConfigurer를 구현하면, @EnableWebMve 어노테이션이 자동으로 설정해주는 세팅값에 사용자가 원하는 세팅 추가 가능
    public void addViewControllers(ViewControllerRegistry  registry){
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("").setViewName("home");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("login");
    }


}
