/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.syst17796_ice4;

/**
 *
 * @author dayoung
 */
public class ContactManager {
    private Contact[] contactList;

    /*
	Locate a Contact record that matches the email address provided.
	Returns the Contact record if found, null if not found.
    */
    public Contact findContact(String emailAddress) {
        for (Contact contact : contactList) {
            if (contact.getEmailAddress().equals(emailAddress)) {
                return contact;
            }
        } 
        return null;
    }

    /*
	 Removes all contacts
    */
    public void clearContacts() {
        contactList = new Contact[0];
        // contactList = null;
    }

    // New comment

    // Another new comment
    
    //This is a comment made on the Friend branch. Testing..
}
