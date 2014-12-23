/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.beans;

/**
 *
 * @author Chari
 */
public enum UserType {
     ADMIN("admin"),
    USER("user");
    private String displayName;
    private String value;
    
    private UserType(String displayName) {
        this.displayName = displayName;
        this.value = name();
    }
    
    public String getDisplayName(){
        return displayName;
    }
    public String getValue(){
        return value;
    }
}
