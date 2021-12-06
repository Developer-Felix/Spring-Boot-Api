package com.example.amigos_leson.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/students")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/all")
    public List<Student> getAllStudent(){
       return studentService.getAllStudent();
    }

//    @RequestMapping(method=RequestMethod.POST, value="/post", produces = "application/json", consumes = "application/json")
    @PostMapping("/post")
    public void registerNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }
}
