package com.afreen.ProjectSpring;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProjectSpringApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ProjectSpringApplication.class, args);

        ProductService service = context.getBean(ProductService.class);
        List<Product> prod = service.getAllProducts();
        for (Product p : prod) {
            System.out.println(p);
        }
    }
}
