package ru.bobojonov.springthymeleafwebapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.bobojonov.springthymeleafwebapp.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}