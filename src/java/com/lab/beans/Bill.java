/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Chari
 */
@Entity
@Table(name="bill")
public class Bill implements Serializable{
    
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private Double total;
    @Column
    private Double discount;
    @Column
    private Double netAmount;
    @Column
    private Double rmpcm;
    @Column
    private String rmpname;
    @Temporal(TemporalType.DATE)
    private Date billDate;
    @ManyToOne
    @JoinColumn(name="patient_id")
    private Patient patient;
    @ManyToOne
    @JoinColumn(name="doctor_id")
    private Doctor doctor;
    @OneToMany(mappedBy="bill",fetch= FetchType.LAZY)
    private Set<Report> reports = new HashSet<Report>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(Double netAmount) {
        this.netAmount = netAmount;
    }

    public Double getRmpcm() {
        return rmpcm;
    }

    public void setRmpcm(Double rmpcm) {
        this.rmpcm = rmpcm;
    }

    public String getRmpname() {
        return rmpname;
    }

    public void setRmpname(String rmpname) {
        this.rmpname = rmpname;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Set<Report> getReports() {
        return reports;
    }

    public void setReports(Set<Report> reports) {
        this.reports = reports;
    }
    
    
    
}
