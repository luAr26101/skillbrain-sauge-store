package com.skillbrain.store;

import com.skillbrain.store.model.Product;
import com.skillbrain.store.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SausageApplication {

    public static void main(String[] args) {
        SpringApplication.run(SausageApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(ProductService productService) {
        return args -> {
            productService.save(new Product(1L, "Cremoasa", 320.00, "https://res.cloudinary.com/sugrobov/image/upload/v1623323635/repos/sausages/6.jpg"));
            productService.save(new Product(2L, "Speciala", 179.00, "https://res.cloudinary.com/sugrobov/image/upload/v1623323635/repos/sausages/5.jpg"));
            productService.save(new Product(3L, "Cu lapte", 225.00, "https://res.cloudinary.com/sugrobov/image/upload/v1623323635/repos/sausages/4.jpg"));
            productService.save(new Product(4L, "Nurnberg", 315.00, "https://res.cloudinary.com/sugrobov/image/upload/v1623323635/repos/sausages/3.jpg"));
            productService.save(new Product(5L, "Munchen", 330.00, "https://res.cloudinary.com/sugrobov/image/upload/v1623323635/repos/sausages/2.jpg"));
            productService.save(new Product(6L, "Ruseasca", 189.00, "https://res.cloudinary.com/sugrobov/image/upload/v1623323635/repos/sausages/1.jpg"));
        };
    }
}
