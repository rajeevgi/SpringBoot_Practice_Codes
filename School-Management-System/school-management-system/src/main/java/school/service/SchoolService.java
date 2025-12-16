package school.service;

import java.util.List;

import school.entity.School;

public interface SchoolService {

    // Save School details
    School addSchools(School school);

    // Get All Schools List
    List<School> getAllSchools();

    // Get School By Id
    School getSchoolById(int id);

    // Update School By Id
    String updateSchool(School school, int id);

    // Delete School By Id
    String deleteSchool(int id);

}
