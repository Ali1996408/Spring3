package ru.kours.springstudents.service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.kours.springstudents.model.Student;
import ru.kours.springstudents.repository.StudentRepository;
import ru.kours.springstudents.service.StudentService;

import java.util.List;

@Service
@AllArgsConstructor

@Primary
public class StudentServiceImp implements StudentService {
    private final StudentRepository repository;

    @Override
    public List<Student> findAllStudent() {
        return repository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findStudentByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteBYEmail(email);

    }
}
