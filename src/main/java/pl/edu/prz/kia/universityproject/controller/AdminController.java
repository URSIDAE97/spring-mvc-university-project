package pl.edu.prz.kia.universityproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pl.edu.prz.kia.universityproject.model.Faculty;
import pl.edu.prz.kia.universityproject.model.Specialization;
import pl.edu.prz.kia.universityproject.model.User;
import pl.edu.prz.kia.universityproject.service.*;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class AdminController {

    private UserService userService;
    private RoleService roleService;
    private UserAnswerService userAnswerService;
    @Autowired
    private FacultyService facultyService;
    @Autowired
    private SpecializationService specializationService;

    @Autowired
    public AdminController(UserService userService) {
        this.userService = userService;
    }
 
	 @GetMapping(value="/admin/edit/{userId}")
    public ModelAndView adminUserEdit(@PathVariable Long userId) {
        ModelAndView modelAndView = new ModelAndView();
        User user = userService.getOne(userId);
        modelAndView.addObject("user", user);
        modelAndView.setViewName("admin/edit");
        return modelAndView;
    }

    @GetMapping(value = "/admin/facultiesList")
    public ModelAndView facultiesList() {
        ModelAndView modelAndView = new ModelAndView();
        List<Faculty> faculties = facultyService.findAll();
        List<Specialization> specializations = specializationService.findAll();
        modelAndView.addObject("faculties", faculties);
        modelAndView.addObject("specs", specializations);
        modelAndView.setViewName("admin/facultiesList");
        return modelAndView;
    }
   
    @PostMapping(value = "/admin/edit/{userId}")
    public String createNewUser(@PathVariable Long userId, @ModelAttribute("updateUser") User updateUser) {
        ModelAndView modelAndView = new ModelAndView();
        userService.updateUser(updateUser);
        modelAndView.addObject("successMessage", "Dane uzytkownika zostaly zaktualizowane.");
        return "redirect:/admin/userList";
    }
	
    @GetMapping(value="/admin/home")
    public ModelAndView adminHome(){
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByEmail(auth.getName());
        modelAndView.addObject("userName", "Witaj " + user.getName() + " " + user.getLastName() + " (" + user.getEmail() + ")");
        modelAndView.addObject("adminMessage","To jest widoczne tylko dla admina");
        modelAndView.setViewName("admin/home");
        return modelAndView;
    }

    @GetMapping(value="/admin/userList")
    public ModelAndView adminUserList(){
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByEmail(auth.getName());
        List <User> users = userService.findAll();
        modelAndView.addObject("users", users);
        modelAndView.addObject("user", user);
        modelAndView.setViewName("admin/userList");
        return modelAndView;
    }

    @GetMapping(value="/admin/adminList")
    public ModelAndView adminList(){
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByEmail(auth.getName());
        List <User> users = userService.findAll();
        modelAndView.addObject("users", users);
        modelAndView.addObject("user", user);
        modelAndView.setViewName("admin/adminList");
        return modelAndView;
    }

    @GetMapping(value="/admin/delete")
    public String adminUserDelete(@RequestParam(name="userId")Long userId) {
        System.out.println(userId);
        userService.deleteUser(userId);
        return "redirect:userList";
    }
}
