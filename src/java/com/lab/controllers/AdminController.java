/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.controllers;

import com.lab.beans.Doctor;
import com.lab.commandbeans.DoctorCommandBean;
import com.lab.service.impl.DoctorServiceImpl;
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
@RequestMapping("/admin")
public class AdminController {
    
    @Autowired
    private DoctorServiceImpl doctorService;
    
    @RequestMapping(value="home",method= RequestMethod.GET)
    public String home(){
        return "/admin/home";
    }
    
    @RequestMapping(value="doctor",method= RequestMethod.GET)
    public String doctors(Model model){
        model.addAttribute("doctorsList", doctorService.findAll());
        model.addAttribute("doctor", new DoctorCommandBean());
        return "/admin/doctors";
    }
    
    @RequestMapping(value="addDoctor",method= RequestMethod.POST)
    public String addDoctor(@ModelAttribute("doctor") DoctorCommandBean doctorCmdBean,ModelMap modelMap){
        Doctor doctor = new Doctor();
        doctor.setName(doctorCmdBean.getDoctorName());
        doctor.setDesignation(doctorCmdBean.getDesignation());
        doctor.setPhoneno(doctorCmdBean.getPhoneno());
        doctor.setHospitalname(doctorCmdBean.getHospitalname());
        doctor.setHospitalPhoneno(doctorCmdBean.getHospitalPhoneno());
        doctorService.addDoctor(doctor);
        modelMap.addAttribute("doctorsList", doctorService.findAll());
        modelMap.addAttribute("doctor", new DoctorCommandBean());
        return "/admin/doctors";
        
    }
    
}
