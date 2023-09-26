package com.primeiroprojeto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;

@Configuration
public class PropsConfig {
    @Bean
    public PropertySourcesPlaceholderConfigurer config() {
        PropertySourcesPlaceholderConfigurer configure = new PropertySourcesPlaceholderConfigurer();
        configure.setLocation(new FileSystemResource("E:\\WorkSpace\\Estudos\\spring bacth" +
                "\\meu codigo\\src\\primeiroprojeto\\config\\application.properties"));
        return configure;
    }
}
