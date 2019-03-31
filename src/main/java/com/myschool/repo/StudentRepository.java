package com.myschool.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.myschool.jpa.Student;
public interface StudentRepository extends CrudRepository<Student, Long> {

    List<Student> findByUserId(String userId);

    @Transactional
    void deleteByUserId(String userId);
}
