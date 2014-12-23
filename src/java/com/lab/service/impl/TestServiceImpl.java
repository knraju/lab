/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.service.impl;

import com.lab.beans.Test;
import com.lab.service.TestService;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Chari
 */
@Service
@Transactional
public class TestServiceImpl implements TestService{

    
    @Override
    public void addTest(Test test) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void updateTest(Test test) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Test findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Test> getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
