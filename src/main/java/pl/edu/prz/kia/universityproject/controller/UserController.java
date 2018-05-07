package pl.edu.prz.kia.universityproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.edu.prz.kia.universityproject.model.User;
import pl.edu.prz.kia.universityproject.model.UserAnswer;
import pl.edu.prz.kia.universityproject.service.UserAnswerService;
import pl.edu.prz.kia.universityproject.service.UserService;

import java.util.List;

@Controller
public class UserController {

    private UserService userService;
    private UserAnswerService userAnswerService;

    @Autowired
    public UserController(UserService userService, UserAnswerService userAnswerService) {
        this.userService = userService;
        this.userAnswerService = userAnswerService;
    }

    @GetMapping(value = "/user/home")
    public ModelAndView userHome() {
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByEmail(auth.getName());
        modelAndView.addObject("user", user);
        modelAndView.setViewName("user/home");
        return modelAndView;
    }

    @GetMapping(value = "/user/survey")
    public ModelAndView userSurvey() {
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByEmail(auth.getName());
        modelAndView.addObject("user", user);

        // -------

        List<UserAnswer> userAnswers = userAnswerService.findByUser(user);
        modelAndView.addObject("answers", userAnswers);

        // -------

        modelAndView.setViewName("user/survey");
        return modelAndView;
    }
}