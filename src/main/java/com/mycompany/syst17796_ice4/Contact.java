/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.syst17796_ice4;

/**
 *
 * @author dayoung
 */
public class Contact {
    private String firstName;
    private String lastName;
    private String emailAddress;

    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String newFirstName) {
        if (newFirstName == null || newFirstName.isEmpty()) {
            this.firstName = "";
        } else {
        this.firstName = newFirstName;
        }
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String newLastName) {
        if (newLastName == null || newLastName.isEmpty()) {
            this.lastName = "";
        } else {
        this.lastName = newLastName;
        }
    }
    
    public String getEmailAddress() {
        return emailAddress;
    }
    
    public void setEmailAddress(String newEmailAddress) {
        if (newEmailAddress == null || newEmailAddress.isEmpty()) {
            this.emailAddress = "";
        } else {
        this.emailAddress = newEmailAddress;
        }
    }
}
