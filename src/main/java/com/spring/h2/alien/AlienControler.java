package com.spring.h2.alien;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

// @Controller
@RestController
public class AlienControler {

    @GetMapping("home")
    public String getAliensList() {
        return "hello.jsp";
    }

    // @GetMapping("/home")
    // public ModelAndView getAliensList() {
    // ModelAndView modelAndView = new ModelAndView("hello");
    // modelAndView.addObject("message", "Hello from the controller!");
    // return modelAndView;
    // }

}
