package school.service;

import java.util.List;

import school.entity.Student;

public interface StudentService {

    // Save Students
    Student addStudents(Student student);

    // List All Students
    List<Student> getAllStudents();
    
    // Get Student By Id
    Student getStudentById(int id);

    // Update Student Details
    String updateStudentDetails(Student student, int id);

    // Delete Student By Id
    String deleteStudentById(int id);

}
