package com.study.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebMvnConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("file/videoFile/**").addResourceLocations("file:D:/student-study/file/video/");
        registry.addResourceHandler("file/imageFile/**").addResourceLocations("file:D:/student-study/file/image/");
//        registry.addResourceHandler("/**")
//                .addResourceLocations("classpath:static/","classpath:META-IFA/resources/","classpath:resources/","classpath:public/","classpath:/");
//        registry.addResourceHandler("swagger-ui.html")
//                .addResourceLocations("classpath:/META-INF/resources/");
//        registry.addResourceHandler("/webjars/**")
//                .addResourceLocations("classpath:/META-INF/resources/webjars/");

    }
}
