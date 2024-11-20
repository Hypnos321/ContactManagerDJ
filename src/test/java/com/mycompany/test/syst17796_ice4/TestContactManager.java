/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.test.syst17796_ice4;

import com.mycompany.syst17796_ice4.Contact;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author dayou
 */
public class TestContactManager {
    
    // Global variables
    com.mycompany.syst17796_ice4.Contact foundContact;
    com.mycompany.syst17796_ice4.ContactManager cm;
    com.mycompany.syst17796_ice4.Contact[] contactList;
    boolean expResult;      // Expected result
    boolean result;         // Actual result
    String keyword;         // Email address used for finding a contact in contactList
    
    public TestContactManager() {
    }
    
    @BeforeAll
    public static void setUpClass() {      
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        // Set the initial contactList
        contactList = new com.mycompany.syst17796_ice4.Contact[5];
        
        for (int i = 0; i < contactList.length; i++) {
            contactList[i].setFirstName("testFirstName" + Integer.toString(i));
            contactList[i].setLastName("testLastName" + Integer.toString(i));
            contactList[i].setEmailAddress("testEmailAddress" + Integer.toString(i));
        } 
        
        // Set the constructor
        cm = new com.mycompany.syst17796_ice4.ContactManager();
    }
    
    @AfterEach
    public void tearDown() {
        // Assign the contact value found from the contactList
        foundContact = cm.findContact(keyword);
        // Check if the test has passed
        assertEquals(expResult, result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:

    // Display contact information of a contact inside the contactList
    @Test
    public void good1() {
        keyword = "testEmailAddress3";
        
        // Set initial result as false and change to true if ther is a match: 
        // Check if the keyword (email) actually exists inside the contactList
        result = false;
        for (Contact contactList1 : contactList) {
            if (contactList1 == foundContact) {
                result = true;
            }
        }
        
        expResult = true;
        
    }
    
    //
    @Test
    public void bad1() {
    
    }
}
