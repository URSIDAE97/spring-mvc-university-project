package pl.edu.prz.kia.universityproject.service;

import pl.edu.prz.kia.universityproject.model.Specialization;
import pl.edu.prz.kia.universityproject.model.User;

import java.util.List;

public interface UserService {
	User findUserByEmail(String email);
	void saveUser(User user);
	void calculateSurveyResults(List<Specialization> specializations, User user);
	List<User> findAll();
}
