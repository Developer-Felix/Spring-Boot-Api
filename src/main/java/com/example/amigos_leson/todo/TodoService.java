package com.example.amigos_leson.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class TodoService {
    public List<Todo> getAllTodos(){
        return List.of(
                new Todo(
                        1L,
                        "First Todo",
                        "Fisrt todo data description",
                        LocalDate.of(2021, Month.DECEMBER,20),
                        LocalDate.of(2021,Month.DECEMBER,23)
                ),
                new Todo(
                        1L,
                        "First Todo",
                        "Fisrt todo data description",
                        LocalDate.of(2021, Month.DECEMBER,20),
                        LocalDate.of(2021,Month.DECEMBER,23)
                ),
                new Todo(
                        1L,
                        "First Todo",
                        "Fisrt todo data description",
                        LocalDate.of(2021, Month.DECEMBER,20),
                        LocalDate.of(2021,Month.DECEMBER,23)
                )
        );
    }
}
