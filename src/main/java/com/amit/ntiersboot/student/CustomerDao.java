package com.amit.ntiersboot.student;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository
public class CustomerDao implements CustomerRepository {

private static List<Student> studentList;
    static {
        studentList = new ArrayList<>();
        Student s1 = new Student("Amit gupta","abc@gmail.com",1,23);
        Student s2 = new Student("Ankit","ankit@gmail.com",2,45);
        studentList.add(s1);
        studentList.add(s2);
    }

    @Override
    public Optional<Student> getStudent(@PathVariable("id") int id ) {
        return studentList.stream()
                .filter(student -> Objects.equals(student.getId(),id)).findFirst();

    }

    @Override
    public List<Student> getAllStudent() {
        return studentList;
    }
}
