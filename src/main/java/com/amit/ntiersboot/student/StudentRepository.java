package com.amit.ntiersboot.student;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {
    Optional<Student> getStudent(int id);
    List<Student> getAllStudent();
}
