package com.smp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smp.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
