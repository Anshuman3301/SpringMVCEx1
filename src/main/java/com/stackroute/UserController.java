package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    /*@RequestMapping("/")
    public String index()
    {
        return "index";
    }*/
    @RequestMapping("/")
    public ModelAndView welcome()
    {
        User user=new User();
        user.setMessage("Welcome to Stackroute");

        ModelAndView mv=new ModelAndView();
        mv.setViewName("index");
        mv.addObject("message", user.getMessage());

        return mv;
    }
}
