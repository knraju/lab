/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Chari
 */
@Controller
@RequestMapping("/user")
public class UserController {
    
    
    public String patients(){
        
        return "patients";
    }
    
}
