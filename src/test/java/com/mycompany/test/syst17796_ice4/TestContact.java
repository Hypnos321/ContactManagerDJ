/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.TestContact to edit this template
 */
package com.mycompany.test.syst17796_ice4;

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
public class TestContact {
    
    // Global variables
    com.mycompany.syst17796_ice4.Contact c; // Contact.java constructor
    String fName;           // Testing first name
    String lName;           // Testing last name
    String email;           // Testing email address
    boolean expResult;      // Expected result
    boolean result;         // Actual result
    
    public TestContact() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        // set the constructor
        c = new com.mycompany.syst17796_ice4.Contact();
    }
    
    @AfterEach
    public void tearDown() {
        // Set values to the Contact object
        c.setFirstName(fName);
        c.setLastName(lName);
        c.setEmailAddress(email);
        // Compare the assigned values and the actual values of the object
        result = (c.getFirstName().equals(fName))
                && (c.getLastName().equals(lName)) 
                && (c.getEmailAddress().equals(email));
        // Check if the test has passed
        assertEquals(expResult, result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    
    // Firstname, lastname, email address provided in proper format
    @Test
    public void testGood1() {
        // Assign values to set for each objects
        fName = "testFirstName";
        lName = "testLastName";
        email = "testEmailAddress";
        // Set expected result
        expResult = true;
    }
    
    // Firstname is null. Lastname and email address provided in proper format
    @Test
    public void testNull1() {
        // Assign values to set for each objects
        fName = null;
        lName = "testLastName";
        email = "testEmailAddress";
        // Set expected result
        expResult = false;
    }
    
    
    // Firstname and lastname is null. Email address provided in proper format
    @Test
    public void testNull2() {
        // Assign values to set for each objects
        fName = null;
        lName = null;
        email = "testEmailAddress";
        // Set expected result
        expResult = false;
    }
    
    // All values are null. 
    @Test
    public void testNull3() {
        // Assign values to set for each objects
        fName = null;
        lName = null;
        email = null;
        // Set expected result
        expResult = false;
    }
    
    // Email address is an empty string.
    // Firstname and lastname provided in proper format
    @Test
    public void testEmptyString1() {
        // Assign values to set for each objects
        fName = "testFirstName";
        lName = "testLastName";
        email = "";
        // Set expected result
        expResult = true;
    }
    
    // Email address and firstname is an empty string.
    // Lastname provided in proper format
    @Test
    public void testEmptyString2() {
        // Assign values to set for each objects
        fName = "";
        lName = "testLastName";
        email = "";
        // Set expected result
        expResult = true;
    }
    
    // All values are an empty string.
    @Test
    public void testEmptyString3() {
        // Assign values to set for each objects
        fName = "";
        lName = "";
        email = "";
        // Set expected result
        expResult = true;
    }
    
    // Lastname is a string with only spaces.
    // Firstname and email address provided in proper format
    @Test
    public void testBlankString1() {
        // Assign values to set for each objects
        fName = "testFirstName";
        lName = "  ";
        email = "tsetEmailAddress";
        // Set expected result
        expResult = true;
    }
    
    // Firstname is empty (no values assigned)
    // Lastname and email address provided in proper format
    @Test
    public void testNoVal1() {
        // Assign values to set for each objects
        lName = "testLastName";
        email = "testEmailAddress";
        // Set expected result
        expResult = false;
    }
    
    // Lastname and email address is empty (no values assigned)
    // Firstname provided in proper format
    @Test
    public void testNoVal2() {
        // Assign values to set for each objects
        fName = "testFirstName";
        // Set expected result
        expResult = false;
    }
}
