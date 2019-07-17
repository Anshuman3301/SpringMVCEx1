package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @RequestMapping("/")
    public ModelAndView welcome()
    {
        User user = new User();
        user.setMessage("Welcome to Stackroute");

        ModelAndView mv=new ModelAndView();
        mv.setViewName("index");
        mv.addObject("message",user.getMessage());
        return mv;
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/ent")
    public ModelAndView index(HttpServletRequest request){

        ModelAndView mv=new ModelAndView("index");
        mv.addObject("userName","Hi "+request.getParameter("userName"));
        //System.out.println(request.getParameter("userName"));
        return mv;
    }
}
