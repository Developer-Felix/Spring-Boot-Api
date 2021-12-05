package com.example.amigos_leson.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository
    ){
        return  args -> {
            Student felix = new Student(
                    1L,
                    "Felix",
                    "onjombafelix@gmail.com",
                    LocalDate.of(2003, Month.APRIL,23)
            );

            Student alex = new Student(
                    "Alex",
                    "alexlix@gmail.com",
                    LocalDate.of(2000, Month.APRIL,23)

            );
            repository.saveAll(
                    List.of(felix,alex)
            );
        };
    }
}
