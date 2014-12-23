/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.service.impl;

import com.lab.beans.Bill;
import com.lab.beans.Doctor;
import com.lab.beans.Patient;
import com.lab.beans.Test;
import com.lab.beans.TestGroup;
import com.lab.beans.User;
import com.lab.dao.impl.DoctorDaoImpl;
import com.lab.dao.impl.PatientDaoImpl;
import com.lab.dao.impl.UserDaoImpl;
import com.lab.service.AdminService;
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
public class AdminServiceImpl implements AdminService{
    
    @Autowired
    private UserDaoImpl userDao;
    @Autowired
    private DoctorDaoImpl doctorDao;
    @Autowired
    private PatientDaoImpl patientDao;
    @Autowired
    private UserServiceImpl userService;

    @Override
    public void addUser(User user) {
        userService.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        userService.updateUser(user);
    }

    @Override
    public void addDoctor(Doctor doctor) {
        doctorDao.addDoctor(doctor);
    }

    @Override
    public void updateDoctor(Doctor doctor) {
        doctorDao.updateDoctor(doctor);
    }

    @Override
    public List<Doctor> getAllDoctors() {
       return doctorDao.findAll();
    }

    @Override
    public void addTestGroup(TestGroup testGroup) {
        
    }

    @Override
    public void updateTestGroup(TestGroup testGroup) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<TestGroup> getAllTestGroups() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addTest(Test test) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void updateTest(Test test) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Test> getAllTests() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addPatient(Patient patient) {
        patientDao.savePatient(patient);
    }

    @Override
    public void updatePatient(Patient patient) {
        patientDao.updatePatient(patient);
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientDao.findAll();
    }

    @Override
    public void addBillToPatient(Bill bill) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
