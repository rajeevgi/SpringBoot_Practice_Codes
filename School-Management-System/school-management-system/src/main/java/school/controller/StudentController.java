package school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import school.entity.Student;
import school.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/saveStudent")
    public Student addStudents(@RequestBody Student student){
        return service.addStudents(student);
    }

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents(){
        return service.getAllStudents();
    }

    @GetMapping("/getStudentById/{id}")
    public Student getStudentById(@PathVariable int id){
        return service.getStudentById(id);
    }

    @PutMapping("/updateStudentDetails/{id}")
    public String updateStudentDetails(@RequestBody Student student, @PathVariable int id){
        return service.updateStudentDetails(student, id);
    }

    @DeleteMapping("/deleteStudentById/{id}")
    public String deleteStudentById(@PathVariable int id){
        return service.deleteStudentById(id);
    }
}
