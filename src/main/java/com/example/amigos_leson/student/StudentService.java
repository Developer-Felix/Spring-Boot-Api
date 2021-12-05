package com.example.amigos_leson.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Service
public class StudentService {
    public List<Student> getAllStudent(){
     return List.of(
             new Student(
                        1L,
                                "Felix",
                                "onjombafelix@gmail.com",
                        LocalDate.of(2000, Month.APRIL,23),
                        21
                                ),
                                new Student(
                        1L,
                                "Felix",
                                "onjombafelix@gmail.com",
                        LocalDate.of(2000, Month.APRIL,23),
                        22
                                ),
                                new Student(
                        1L,
                                "Felix",
                                "onjombafelix@gmail.com",
                        LocalDate.of(2000, Month.APRIL,23),
                        23
                                )
                                );
}
}
