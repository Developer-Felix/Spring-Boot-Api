package com.example.amigos_leson;

import com.example.amigos_leson.product.Product;
import com.example.amigos_leson.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class AmigosLesonApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmigosLesonApplication.class, args);
	}
}
