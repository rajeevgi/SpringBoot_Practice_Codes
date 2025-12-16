package school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import school.entity.School;
import school.repository.SchoolRepository;

@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolRepository repository;

    @Override
    public School addSchools(School school) {
       return repository.save(school);
    }

    @Override
    public List<School> getAllSchools() {
        return repository.findAll();
    }

    @Override
    public School getSchoolById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public String updateSchool(School school, int id) {
        
        repository.findById(id)
                    .map(s -> {
                        s.setSchoolName(school.getSchoolName());
                        s.setYear(school.getYear());
                        s.setAddress(school.getAddress());

                        return repository.save(s);
                    }).orElseThrow(() -> new RuntimeException("School not found!"));

        return "School data updated Successfully...";
    }

    @Override
    public String deleteSchool(int id) {
        repository.deleteById(id);
        return "School data deleted Successfully...";
    }
}
