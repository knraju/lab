/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.dao;

import com.lab.beans.Test;
import java.util.List;

/**
 *
 * @author Chari
 */
public interface TestDao {
    
    public void addTest(Test test);
    public void updateTest(Test test);
    public Test findById(Long id);
    public List<Test> getAll();
    
}
