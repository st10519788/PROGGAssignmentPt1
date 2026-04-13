

package com.mycompany.progassignmentpt1;

import java.util.*;
public class ProgAssignmentPt1 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
      // print registration input
        System.out.println("---------------------");
        System.out.println("Registration System");
        System.out.println("-----------------------");
        
        System.out.println("Enter your first name: ");
          String name = input.nextLine();
        System.out.println("Enter your last name: ");
           String lastName = input.nextLine();
        
        
       //declaring variables
        
          String username;
        String password;
        String cell;

        Login user;

        // loop for username
        do {
            System.out.print("Enter Username: ");
            username = input.nextLine();

            user = new Login(name, lastName, username, "", "");

            if (!user.checkUserName()) {
                System.out.println("Username is not correctly formatted.");
                System.out.println("Must contain '_' and be no more than 5 characters.\n");
            }

        } while (!user.checkUserName());

        System.out.println("Username successfully captured.\n");

        // loop for password
        do {
            System.out.print("Enter Password: ");
            password = input.nextLine();

            user = new Login(name, lastName, username, password, "");

            if (!user.checkPasswordComplexity()) {
                System.out.println("Password is not correctly formatted.");
                System.out.println("Must be at least 8 characters, include a capital letter, number, and special character.\n");
            }

        } while (!user.checkPasswordComplexity());

        System.out.println("Password successfully captured.\n");

        // loop for cell phone number
        do {
            System.out.print("Enter Cell Number (+27...): ");
            cell = input.nextLine();

            user = new Login(name, lastName, username, password, cell);

            if (!user.checkCellPhoneNumber()) {
                System.out.println("Cell phone number incorrectly formatted.");
                System.out.println("Must start with +27 and be correct length.\n");
            }

        } while (!user.checkCellPhoneNumber());

        System.out.println("Cell phone number successfully added.\n");

        // the final object with all the values
        user = new Login(name, lastName, username, password, cell);

        System.out.println("User has been registered successfully.\n");

        // login
        System.out.println("-------------------------------");
        System.out.println(" LOGIN ");
        System.out.println("--------------------------------");

        System.out.print("Enter Username: ");
        String loginUser = input.nextLine();

        System.out.print("Enter Password: ");
        String loginPass = input.nextLine();

       
        boolean success = user.loginUser(loginUser, loginPass);

        System.out.println(user.returnLoginStatus(success));

       
        
        
    }
}


    

