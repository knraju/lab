/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.dao.impl;

import com.lab.beans.Doctor;
import com.lab.dao.DoctorDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Chari
 */
@Repository
public class DoctorDaoImpl implements DoctorDao{

    @Autowired
    private HibernateTemplate hibernateTemplate;
    
    @Override
    public void addDoctor(Doctor doctor) {
        hibernateTemplate.save(doctor);
    }

    @Override
    public void updateDoctor(Doctor doctor) {
        hibernateTemplate.saveOrUpdate(doctor);
    }

    @Override
    public Doctor findById(Long id) {
       return hibernateTemplate.get(Doctor.class, id);
    }

    @Override
    public List<Doctor> findAll() {
        return hibernateTemplate.find("from Doctor");
    }
    
}
