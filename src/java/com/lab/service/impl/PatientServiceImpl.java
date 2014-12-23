/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.service.impl;

import com.lab.beans.Patient;
import com.lab.dao.impl.PatientDaoImpl;
import com.lab.service.PatientService;
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
public class PatientServiceImpl implements PatientService{
    
    @Autowired
    PatientDaoImpl patientDao;

    @Override
    public void savePatient(Patient patient) {
        patientDao.savePatient(patient);
    }

    @Override
    public void updatePatient(Patient patient) {
        patientDao.updatePatient(patient);
    }

    @Override
    public Patient findById(String id) {
        return patientDao.findById(id);
    }

    @Override
    public List<Patient> findAll() {
        return patientDao.findAll();
    }
    
}
