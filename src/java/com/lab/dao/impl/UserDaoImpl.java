/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.dao.impl;

import com.lab.beans.User;
import com.lab.dao.UserDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Chari
 */
@Repository
public class UserDaoImpl implements UserDao{
    
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public void addUser(User user) {
        hibernateTemplate.save(user);
    }

    @Override
    public void updateUser(User user) {
        hibernateTemplate.update(user);
    }

    @Override
    public List<User> findAll() {
        return hibernateTemplate.find("from User");
    }

    @Override
    public User findByUsernameAndPassword(String username, String password) {
        List<User> user = hibernateTemplate.find("from User where username=? and password=?", new Object[]{username,password});
        System.out.println("userlist"+user);
        return user.size()==1?user.get(0):null;
    }

    @Override
    public User findById(Long id) {
        return hibernateTemplate.get(User.class, id);
    }
    
}
