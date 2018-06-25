package pl.edu.prz.kia.universityproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.prz.kia.universityproject.model.Faculty;
import pl.edu.prz.kia.universityproject.model.Specialization;
import pl.edu.prz.kia.universityproject.repository.FacultyRepository;

import java.util.List;

@Service
public class FacultyService {

    private FacultyRepository facultyRepository;
    @Autowired
    private SpecializationService specializationService;

    @Autowired
    public FacultyService(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public List<Faculty> findAll() {
        return facultyRepository.findAll();
    }
    

    public void deleteFaculty(Long facultyId) {
    	for(Specialization spec : this.specializationService.findAll()){
    		if(spec.getFaculty().getId() == facultyId) {
    			specializationService.deleteSpecialization(spec.getId());
    		}
    	}
        this.facultyRepository.deleteById(facultyId);
    }
}
