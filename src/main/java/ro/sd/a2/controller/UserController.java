package ro.sd.a2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import ro.sd.a2.dto.CreateUserDtoFront;
import ro.sd.a2.dto.MovieDataDto;
import ro.sd.a2.service.MovieService;
import ro.sd.a2.service.UserService;

@Controller
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(FirstController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private MovieService movieService;

    //@GetMapping("/loginpg")

    @GetMapping("/home")
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView();

        mav.setViewName("login");

        return mav;
    }

    @PostMapping("/login")
    public ModelAndView logIn(){
        ModelAndView mav = new ModelAndView();

        mav.setViewName("login");

        return mav;
    }

    @PostMapping("/signinpg")
    public ModelAndView signInPg(){
        ModelAndView mav = new ModelAndView();

        mav.setViewName("signinpg");
        return mav;
    }




    @PostMapping("/signin")
    public  ModelAndView signIn(CreateUserDtoFront dtoFront){
        ModelAndView mav = new ModelAndView();

        userService.createAcount(dtoFront);
        System.out.println(dtoFront.getName());

        mav.setViewName("login");
        return mav;
    }


}
