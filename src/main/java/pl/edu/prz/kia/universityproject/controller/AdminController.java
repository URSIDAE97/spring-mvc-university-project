package pl.edu.prz.kia.universityproject.controller;

import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import pl.edu.prz.kia.universityproject.model.Faculty;
import pl.edu.prz.kia.universityproject.model.Specialization;
import pl.edu.prz.kia.universityproject.model.User;
import pl.edu.prz.kia.universityproject.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;


@Controller
public class AdminController {

    @Autowired
    private FacultyService facultyService;
    @Autowired
    private FacultyService editFaculty;
    @Autowired
    private SpecializationService specializationService;

    private UserService userService;
    private RoleService roleService;
    private UserAnswerService userAnswerService;private Object facultiesPost;

    @Autowired
    public AdminController(UserService userService) {
        this.userService = userService;
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
    @GetMapping(value="/admin/facultiesSpecializationsList")
    public ModelAndView adminFacultiesSpecializationsList(){
        ModelAndView modelAndView = new ModelAndView();
        List<Faculty> faculties = facultyService.findAll();
        List <Specialization> specializations = specializationService.findAll();
        modelAndView.addObject("faculties", faculties);
        modelAndView.addObject("specializations", specializations);
        modelAndView.setViewName("admin/facultiesSpecializationsList");
        return modelAndView;
    }
    @GetMapping(value="/admin/facultiesSpecializationsEdit")
    public ModelAndView adminFacultiesSpecializationsEdit(){
        ModelAndView modelAndView = new ModelAndView();
        List<Faculty> faculties = facultyService.findAll();
        List <Specialization> specializations = specializationService.findAll();
        Specialization specialization = new Specialization();
        modelAndView.addObject("faculties", faculties);
        modelAndView.addObject("specializations", specializations);
        modelAndView.addObject("specialization", specialization);
        modelAndView.setViewName("admin/facultiesSpecializationsEdit");
        return modelAndView;
    }

    @PostMapping(value="/admin/facultiesSpecializationsEdit")
    public ModelAndView specializationUpdate(@Valid Specialization specialization, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        List <Specialization> specializations = specializationService.findAll();
        List<Faculty> faculties = facultyService.findAll();
        if(specialization.getId() > specializations.size()){
            bindingResult.rejectValue("id", "error.id","Nie ma specjalizacji o takim ID!");
        }
        else if(specialization.getFaculty().getId() > faculties.size()){
            bindingResult.rejectValue("faculty", "error.faculty.id","Nie ma wydziału o takim ID!");
        }

System.out.println(specialization.getFaculty().getId());
        System.out.println(faculties.size());
        if (bindingResult.hasErrors()){
            modelAndView.setViewName("/admin/facultiesSpecializationsEdit");
        }        else        {
            specializationService.updateSpecialization(specialization);
            modelAndView.addObject("specialization", specialization);
            modelAndView.addObject("faculties", faculties);
            modelAndView.setViewName("redirect:facultiesSpecializationsList");
        }
        return modelAndView;
    }
}
