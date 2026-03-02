package com.FirstProject.JavaLearner.Repository;

import com.FirstProject.JavaLearner.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
}
