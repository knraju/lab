/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.dao;

import com.lab.beans.Patient;
import java.util.List;

/**
 *
 * @author Chari
 */
public interface PatientDao {
    
    void savePatient(Patient patient);
    void updatePatient(Patient patient);
    Patient findById(String id);
    List<Patient> findAll();
    
}
