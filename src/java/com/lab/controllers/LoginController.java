/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.controllers;

import com.lab.beans.User;
import com.lab.commandbeans.LoginCommandBean;
import com.lab.service.impl.UserServiceImpl;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 *
 * @author Chari
 */
@Controller
public class LoginController {
    
    @Autowired
    private UserServiceImpl userService;
    
    @RequestMapping(value={"login"},method= RequestMethod.GET)
    public String loginForm(ModelMap map ){
        map.addAttribute("loginUser", new LoginCommandBean());
        return "login";
    }
    
    @RequestMapping(value={"login"},method= RequestMethod.POST)
    public String validate(@ModelAttribute("loginUser") LoginCommandBean loginUser,Model model,HttpServletRequest request){
        
        System.out.println("username"+loginUser.getUsername());
        System.out.println("password"+loginUser.getPassword());
       User user = userService.findByUsernameAndPassword(loginUser.getUsername(), loginUser.getPassword());
       // Employee employee = null;
        if(user!=null){
            request.getSession().setAttribute("username", user.getUsername());
            request.getSession().setAttribute("userType", user.getUserType().getValue());
            String userType = user.getUserType().getDisplayName();
            return "redirect:"+userType+"/home.htm";
        }
        else{
            model.addAttribute("err", "invalid username or password");
            return "login";
        }
    }
}
