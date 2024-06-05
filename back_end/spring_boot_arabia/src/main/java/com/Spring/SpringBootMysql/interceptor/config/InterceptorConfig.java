package com.Spring.SpringBootMysql.interceptor.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.Spring.SpringBootMysql.interceptor.MyInterceptor;
import com.Spring.SpringBootMysql.interceptor.MyUserInterceptor;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyUserInterceptor()).addPathPatterns("/user");
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
    }
}
