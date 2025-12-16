package school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import school.entity.Student;
import school.repository.StudentDao;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao dao;

    @Override
    @Transactional
    public Student addStudents(Student student) {
        return dao.save(student);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Student> getAllStudents() {
        return dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Student getStudentById(int id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public String updateStudentDetails(Student student, int id) {
        dao.findById(id)
            .map(st -> {
                st.setName(student.getName());
                st.setAddress(student.getAddress());
                st.setAge(student.getAge());

                return dao.save(st);
            }).orElseThrow(() -> new RuntimeException("Student not found!"));

        return "Student Updated Successfully...";
    }

    @Override
    public String deleteStudentById(int id) {
        dao.deleteById(id);
        return "Student Deleted Successfully...";
    }
}
