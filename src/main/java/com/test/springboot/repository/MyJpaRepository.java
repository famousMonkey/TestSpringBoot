package com.test.springboot.repository;


import com.test.springboot.bean.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyJpaRepository extends JpaRepository<Student,String> {

}
