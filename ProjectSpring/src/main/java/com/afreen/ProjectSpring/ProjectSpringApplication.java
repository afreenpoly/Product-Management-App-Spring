package com.afreen.ProjectSpring;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectSpringApplication.class, args);

		ProductService service = new ProductService();
		List<Product> prod = service.getAllProducts();
        for (Product p : prod) {
            System.out.println(p);
        }

	}

}
