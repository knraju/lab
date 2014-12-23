/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.service;

import com.lab.beans.Doctor;
import java.util.List;

/**
 *
 * @author Chari
 */
public interface DoctorService {
    public void addDoctor(Doctor doctor);
    public void updateDoctor(Doctor doctor);
    public Doctor findById(Long id);
    public List<Doctor> findAll();
    
}
