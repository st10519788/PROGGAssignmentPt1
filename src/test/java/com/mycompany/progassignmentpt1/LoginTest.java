
package com.mycompany.progassignmentpt1;

import org.junit.Test;
import static org.junit.Assert.*;


public class LoginTest {
    
   public LoginTest() {
    }
// test for username
    @Test
    public void testCheckUserName() {
          Login login = new Login("Kyle", "Smith", "kyle!!!!!!", "Ch&&sec@ke99!", "+27838968976");
        String expected = "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
        String real = login.registerUser();

        assertEquals(expected , real);
    }
// test for password
    @Test
    public void testCheckPasswordComplexity() {
      Login login = new Login("Kyle", "Smith", "kyl_1", "password", "+27838968976");
        String expected = "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        String real = login.registerUser();

        assertEquals(expected, real);
    }
// test for cellphone number
    @Test
    public void testCheckCellPhoneNumber() {
        Login login = new Login("Kyle", "Smith", "kyl_1", "Ch&&sec@ke99!", "08966553");
        String expected = "Cell phone number incorrectly formatted or does not contain international code.";
        String real = login.registerUser();

        assertEquals(expected, real);
    }
// test for register user
    @Test
    public void testRegisterUser() {
          Login login = new Login("Kyle", "Smith", "kyl_1", "Ch&&sec@ke99!", "+27838968976");
        String expected = "User has been registered successfully.";
        String real = login.registerUser();

        assertEquals(expected, real);
    }
// test for user login
    @Test
    public void testLoginUser() {
         Login login = new Login("Kyle", "Smith", "kyl_1", "Ch&&sec@ke99!", "+27838968976");
        String expected = "Welcome Kyle Smith, it is great to see you again.";
        String real = login.returnLoginStatus(true);

        assertEquals(expected, real);
    }

    @Test
    public void testReturnLoginStatus() {
         Login login = new Login("Kyle", "Smith", "kyl_1", "Ch&&sec@ke99!", "+27838968976");
        String expected = "Username or password incorrect, please try again.";
        String real = login.returnLoginStatus(false);
        assertEquals(expected, real);
    }
}