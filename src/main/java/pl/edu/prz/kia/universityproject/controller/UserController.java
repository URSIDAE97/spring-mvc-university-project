package pl.edu.prz.kia.universityproject.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.edu.prz.kia.universityproject.model.Question;
import pl.edu.prz.kia.universityproject.model.User;
import pl.edu.prz.kia.universityproject.model.UserAnswer;
import pl.edu.prz.kia.universityproject.model.UserAnswersWrapper;
import pl.edu.prz.kia.universityproject.service.QuestionService;
import pl.edu.prz.kia.universityproject.service.UserAnswerService;
import pl.edu.prz.kia.universityproject.service.UserService;

import java.util.List;
import java.util.logging.Logger;


@Controller
public class UserController {

    private UserService userService;
    private UserAnswerService userAnswerService;
    @Autowired
    private QuestionService questionService;

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

    @PostMapping(path="/user/survey")
    public String surveyUpdate(@ModelAttribute("wrapper") UserAnswersWrapper wrapper) {
        ModelAndView modelAndView = new ModelAndView();
       for(UserAnswer userAnswer : wrapper.getAnswerList()) {
           //userAnswerService.update(userAnswer.getId(), userAnswer.getQuestion(), userAnswer.getValue(), userAnswer.getUser().getId());
           System.out.println(userAnswer.getId());
           System.out.println(userAnswer.getQuestion().getId());
           System.out.println(userAnswer.getUser().getId());
           System.out.println(userAnswer.getValue());


        }
        System.out.println(wrapper.getAnswerList());
        //modelAndView.setViewName("user/home");
       // model.addAttribute("wrapper", wrapper);
        return "user/survey";
    }


    @GetMapping(value = "/user/survey")
    public ModelAndView userSurvey() {
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByEmail(auth.getName());
        modelAndView.addObject("user", user);

        //-------

        UserAnswersWrapper wrapper = new UserAnswersWrapper(userAnswerService.findByUser(user));
        modelAndView.addObject("wrapper", wrapper);

        // -------

        List<UserAnswer> userAnswers = userAnswerService.findByUser(user);
        modelAndView.addObject("userAnswers", userAnswers);

        // -------

        List<Question> questions = questionService.findAll();
        modelAndView.addObject("questions", questions);

        // -------

        modelAndView.setViewName("user/survey");
        return modelAndView;
    }

}