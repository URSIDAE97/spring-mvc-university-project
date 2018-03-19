package pl.edu.prz.kia.universityproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.edu.prz.kia.universityproject.model.Example;
import pl.edu.prz.kia.universityproject.model.User;
import pl.edu.prz.kia.universityproject.service.ExampleService;
import pl.edu.prz.kia.universityproject.service.UserService;

import java.util.List;

@Controller
public class UserController {

    private UserService userService;
    private ExampleService exampleService;

    @Autowired
    public UserController(UserService userService, ExampleService exampleService) {
        this.userService = userService;
        this.exampleService = exampleService;
    }

    @GetMapping(value="/user/home")
    public ModelAndView userHome(){
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByEmail(auth.getName());

        // EXAMPLE
        List<Example> examples = exampleService.getAll();
        modelAndView.addObject("examples", examples);
        // -------

        modelAndView.addObject("user", user);
        modelAndView.setViewName("user/home");

        return modelAndView;
    }
}
