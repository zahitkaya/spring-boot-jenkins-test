package com.example.demo.controller.rest;

import com.example.demo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student/v1")
public class StudentController {

    @PostMapping("/get")
    public Student getStudent(@RequestBody Student student){
        return student;
    }

}
