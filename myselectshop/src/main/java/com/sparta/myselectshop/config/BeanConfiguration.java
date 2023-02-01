package com.sparta.myselectshop.config;

import com.sparta.myselectshop.repository.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    //ProductRepository를 받는 생성자.
/*    @Bean
    public ProductRepository productRepository() {
        String dbUrl = "jdbc:h2:mem:db";
        String username = "sa";
        String password = "";
        return new ProductRepository(dbUrl, username, password);
    }*/
}