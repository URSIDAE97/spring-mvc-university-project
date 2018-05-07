package pl.edu.prz.kia.universityproject.service;

import pl.edu.prz.kia.universityproject.model.Question;
import pl.edu.prz.kia.universityproject.model.Role;
import pl.edu.prz.kia.universityproject.model.User;
import pl.edu.prz.kia.universityproject.repository.RoleRepository;
import pl.edu.prz.kia.universityproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{

	private UserRepository userRepository;
    private RoleRepository roleRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    private QuestionService questionService;
    private UserAnswerService userAnswerService;

    @Autowired
	public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, BCryptPasswordEncoder bCryptPasswordEncoder, QuestionService questionService, UserAnswerService userAnswerService) {
		this.userRepository = userRepository;
		this.roleRepository = roleRepository;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
		this.questionService = questionService;
		this.userAnswerService = userAnswerService;
	}

	@Override
	public User findUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public void saveUser(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setActive(1);
		Role userRole = roleRepository.findByRole("USER");
		user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));

		//Dodanie uzytkownikowi domyslnych wartosci dla kazdego pytania

		List<Question> questions = questionService.findAll();
		questions.forEach(question -> userAnswerService.addAnswer(0, question, user));

		// ------

		userRepository.save(user);
	}

}
