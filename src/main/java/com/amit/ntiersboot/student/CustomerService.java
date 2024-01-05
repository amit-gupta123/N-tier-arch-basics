package com.amit.ntiersboot.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository repository;


    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }


    public Student getStudent(int id){
        return this.repository.getStudent(id)
                .orElseThrow(()->new IllegalArgumentException("Student with id [%s] not found".formatted(id)));
    }

    public List<Student> getAllStudent(){
        return this.repository.getAllStudent();
    }

}
