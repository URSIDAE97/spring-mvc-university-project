package pl.edu.prz.kia.universityproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.prz.kia.universityproject.model.Faculty;
import pl.edu.prz.kia.universityproject.model.Specialization;
import pl.edu.prz.kia.universityproject.model.User;
import pl.edu.prz.kia.universityproject.repository.FacultyRepository;
import pl.edu.prz.kia.universityproject.repository.SpecializationRepository;
import pl.edu.prz.kia.universityproject.repository.UserRepository;

import java.util.List;

@Service
public class SpecializationService {

    private SpecializationRepository specializationRepository;
    @Autowired
    private UserService userService;

    @Autowired
    public SpecializationService(SpecializationRepository specializationRepository) {
        this.specializationRepository = specializationRepository;
    }

    public List<Specialization> findAll() {
        return specializationRepository.findAll();
    }
    
    public void deleteSpecialization(Long specializationId) {
    	List<User> modifiedUser = this.userService.deleteSpecializationBySpecializationID(specializationId);
    		
    	this.specializationRepository.deleteById(specializationId);
    	
    	//Reassigning specializations of modified Users
    	if(!modifiedUser.isEmpty()){ 
    		for(User user : modifiedUser)
    			this.userService.calculateSurveyResults(specializationRepository.findAll(), user);
    	}
    }

}
