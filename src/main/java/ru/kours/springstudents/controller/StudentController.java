package ru.kours.springstudents.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.kours.springstudents.model.Student;
import ru.kours.springstudents.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {


 private final StudentService service;
 @GetMapping
 public List<Student> findAllStudent(){
  // TODO
  return service.findAllStudent();
 }
 @PostMapping("save_student")
public String saveStudent(@RequestBody Student student) {
   service.saveStudent(student);
   return "Student successfully saved";
}
@GetMapping("/{email}")
public Student findByEmail(@PathVariable("email") String email){
 return service.findByEmail(email);

}
@PutMapping("update_student")
public Student updateStudent(@RequestBody Student student){
  return service.updateStudent(student);
}
@DeleteMapping("delete_student/{email}")
public void deleteStudent (@PathVariable String email){
   service.deleteStudent(email);
}
}
