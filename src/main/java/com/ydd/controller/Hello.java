package com.ydd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  
public class Hello {  
	@RequestMapping(value="/index")
	@ResponseBody
    public String index(Model model){  
         
        return "index";  
    }  
    @RequestMapping("/hello")  
    public String hello(Model model){  
        System.out.println("hello world");
        return "index";  
    }  
      
}  