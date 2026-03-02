package com.FirstProject.JavaLearner.Controller;

import com.FirstProject.JavaLearner.Entity.Student;
import com.FirstProject.JavaLearner.Repository.StudentRepo;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentRepo studentRepo;

    public StudentController(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student){
        return studentRepo.save(student);
    }

    @GetMapping("/all")
    public List<Student> getAllStudent(){
        return studentRepo.findAll();
    }
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id){
        return studentRepo.findById(id)
                .orElseThrow(()->new RuntimeException("Not Found"));
    }

}
