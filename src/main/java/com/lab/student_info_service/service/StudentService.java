package com.lab.student_info_service.service;

import com.lab.student_info_service.model.Student;
import com.lab.student_info_service.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public Optional<Student> getStudentById(Long id){
        return studentRepository.findById(id);
    }

}
