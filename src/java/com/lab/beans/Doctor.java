/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.beans;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Chari
 */

@Entity
@Table(name="doctor")
public class Doctor implements Serializable {
    
    
    @Id
    @GeneratedValue
    private Long id;
    @Column    
    private String name;
    @Column
    private String designation;
    @Column
    private String phoneno;
    @Column
    private String hospitalname;
    @Column
    private String hospitalPhoneno;
    @OneToMany(mappedBy="doctor",fetch= FetchType.LAZY)
    private Set<Patient> patients = new HashSet<Patient>();

    public String getHospitalPhoneno() {
        return hospitalPhoneno;
    }

    public void setHospitalPhoneno(String hospitalPhoneno) {
        this.hospitalPhoneno = hospitalPhoneno;
    }

    public Set<Patient> getPatients() {
        return patients;
    }

    public void setPatients(Set<Patient> patients) {
        this.patients = patients;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getHospitalname() {
        return hospitalname;
    }

    public void setHospitalname(String hospitalname) {
        this.hospitalname = hospitalname;
    }
    
    
}
