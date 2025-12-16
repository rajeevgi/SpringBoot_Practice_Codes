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

import jakarta.validation.Valid;
import school.entity.School;
import school.service.SchoolService;

@RestController
@RequestMapping("/api/school")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @PostMapping("/saveSchool")
    public School addSchools(@Valid @RequestBody School school){
        return schoolService.addSchools(school);
    }

    @GetMapping("/listAllSchools")
    public List<School> getAllSchools(){
        return schoolService.getAllSchools();
    }

    @GetMapping("/getSchoolById/{id}")
    public School getSchoolById(@PathVariable int id){
        return schoolService.getSchoolById(id);
    }

    @PutMapping("/updateSchoolData/{id}")
    public String updateSchool(@Valid @RequestBody School school, @PathVariable int id){
        return schoolService.updateSchool(school, id);
    }

    @DeleteMapping("/deleteSchool/{id}")
    public String deleteSchool(@PathVariable int id){
        return schoolService.deleteSchool(id);
    }
}
