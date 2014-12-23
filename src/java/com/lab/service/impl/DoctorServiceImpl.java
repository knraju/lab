/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.service.impl;

import com.lab.beans.Doctor;
import com.lab.dao.impl.DoctorDaoImpl;
import com.lab.service.DoctorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Chari
 */
@Service
@Transactional
public class DoctorServiceImpl implements DoctorService{

    @Autowired
    DoctorDaoImpl doctorDao;
    
    @Override
    public void addDoctor(Doctor doctor) {
        doctorDao.addDoctor(doctor);
    }

    @Override
    public void updateDoctor(Doctor doctor) {
        doctorDao.updateDoctor(doctor);
    }

    @Override
    public Doctor findById(Long id) {
        return doctorDao.findById(id);
    }

    @Override
    public List<Doctor> findAll() {
        return doctorDao.findAll();
    }
    
}
