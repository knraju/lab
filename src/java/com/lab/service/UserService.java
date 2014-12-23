/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.service;

import com.lab.beans.User;
import java.util.List;

/**
 *
 * @author Chari
 */
public interface UserService {
    
    void addUser(User user);
    void updateUser(User user);
    List<User> findAll();
    User findByUsernameAndPassword(String username,String password);
    User findById(Long id);
    
    
}
