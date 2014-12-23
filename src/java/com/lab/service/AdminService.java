/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.service;

import com.lab.beans.Bill;
import com.lab.beans.Doctor;
import com.lab.beans.Patient;
import com.lab.beans.Test;
import com.lab.beans.TestGroup;
import com.lab.beans.User;
import java.util.List;

/**
 *
 * @author Chari
 */
public interface AdminService {
    
    void addUser(User user);
    void updateUser(User user);
    void addDoctor(Doctor doctor);
    void updateDoctor(Doctor doctor);
    List<Doctor> getAllDoctors();
    void addTestGroup(TestGroup testGroup);
    void updateTestGroup(TestGroup testGroup);
    List<TestGroup> getAllTestGroups();
    void addTest(Test test);
    void updateTest(Test test);
    List<Test> getAllTests();
    void addPatient(Patient patient);
    void updatePatient(Patient patient);
    List<Patient> getAllPatients();
    void addBillToPatient(Bill bill);
    
    
    
}
