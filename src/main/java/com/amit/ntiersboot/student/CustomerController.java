package com.amit.ntiersboot.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping("/api/v1/students")
    public List<Student> getAllStudent(){
        return service.getAllStudent();
    }

    @GetMapping("/api/v1/student/{id}")
    public Student getStudent(@PathVariable ("id") int  id){
        return service.getStudent(id);
    }

}
