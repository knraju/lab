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
@Table(name="testgroup")
public class TestGroup implements Serializable {
    @Id
    @GeneratedValue
    private Long groupId;
    @Column
    private String groupName;
    @OneToMany(mappedBy="testGroup",fetch= FetchType.LAZY)
    private Set<Test> tests = new HashSet<Test>();
    
}
