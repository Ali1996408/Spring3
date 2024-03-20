package ru.kours.springstudents.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kours.springstudents.model.Student;

public interface StudentRepository extends JpaRepository<Student , Long> {
    void deleteBYEmail(String email);
    Student findStudentByEmail(String email);

}
