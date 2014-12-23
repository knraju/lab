/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.service;

import com.lab.beans.TestGroup;
import java.util.List;

/**
 *
 * @author Chari
 */
public interface TestGroupService {
    
    void addTestGroup(TestGroup testGroup);
    void updateTestGroup(TestGroup testGroup);
    List<TestGroup> getAll();
    TestGroup findById(Long id);
    
}
