/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.dao.impl;

import com.lab.beans.Patient;
import com.lab.dao.PatientDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Chari
 */
@Repository
public class PatientDaoImpl implements PatientDao{

    @Autowired
    private HibernateTemplate hibernateTemplate;
    
    @Override
    public void savePatient(Patient patient) {
        hibernateTemplate.save(patient);
    }

    @Override
    public void updatePatient(Patient patient) {
        hibernateTemplate.update(patient);
    }

    @Override
    public Patient findById(String id) {
        return hibernateTemplate.get(Patient.class, id);
    }

    @Override
    public List<Patient> findAll() {
        return hibernateTemplate.find("from Patient");
    }
    
}
