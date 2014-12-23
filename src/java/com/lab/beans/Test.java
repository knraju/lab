/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.beans;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Chari
 */
@Entity
@Table(name="test")
public class Test implements Serializable {
    
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String name;
    @Column
    private String maleNormalRange;
    @Column
    private String femaleNormalRange;
    @Column
    private Double cost;
    @Column
    private String scale;
    @ManyToOne
    @JoinColumn(name="testgroup_id")
    private TestGroup testGroup;

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

    public String getMaleNormalRange() {
        return maleNormalRange;
    }

    public void setMaleNormalRange(String maleNormalRange) {
        this.maleNormalRange = maleNormalRange;
    }

    public String getFemaleNormalRange() {
        return femaleNormalRange;
    }

    public void setFemaleNormalRange(String femaleNormalRange) {
        this.femaleNormalRange = femaleNormalRange;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public TestGroup getTestGroup() {
        return testGroup;
    }

    public void setTestGroup(TestGroup testGroup) {
        this.testGroup = testGroup;
    }
    
}
