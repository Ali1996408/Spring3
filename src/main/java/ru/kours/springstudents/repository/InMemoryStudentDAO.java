package ru.kours.springstudents.repository;

import org.springframework.stereotype.Repository;
import ru.kours.springstudents.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
@Repository
public class InMemoryStudentDAO {
    private final List<Student> Students = new ArrayList<>();
    public List<Student> findAllStudent() {
        return Students;
    }


    public Student saveStudent(Student student) {
        Students.add(student);
        return student;
    }


    public Student findByEmail(String email) {
        
        return Students.stream()
                .filter(element->element.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }


    public Student updateStudent(Student student) {
        var studentIndex= IntStream.range(0,Students.size())
                .filter(index->Students.get(index).getEmail().equals(student.getEmail()))
                .findFirst()
                .orElse(-1);
        if(studentIndex>-1) {
            Students.set(studentIndex, student);
            return student;
        }


        return null;
    }


    public void deleteStudent(String email) {
        var student=findByEmail(email);
        if (student!= null)
            Students.remove(student);


    }


}
