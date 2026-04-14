/*  Name & Surname: Rivo Mathye
 * ST number: ST10519788
 *
*/
package com.mycompany.progassignmentpt1;

class Login {
     //declaring variables
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String cellNr;
    
    public Login(String firstName, String lastName, String userName, String password,String cellNr){
        // initialising the values
       this.firstName = firstName; 
       this.lastName = lastName;
       this.userName= userName;
       this.password= password;
       this.cellNr = cellNr;
    }
    
    public boolean checkUserName(){
      if(userName.contains("_")&& userName.length()==5){
          return true;
      } 
      return false;  
    } 
    
    
    public boolean checkPasswordComplexity(){
        boolean hasUpper = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;
        
        if (password.length()<8){
            return false;
        }
        //for loop for the password
        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);
            
            if (Character.isUpperCase(character)) {
             hasUpper  = true; 
            }else if (Character.isDigit(character)) {
              hasNumber = true;  
            }else if (!Character.isLetterOrDigit(character)) {
                hasSpecial = true;
            }
        }
        return hasUpper && hasNumber && hasSpecial;
    }
    
    public boolean checkCellPhoneNumber() {

    if (!cellNr.startsWith("+27")) {
        return false;
    }
// 12= the 27 and the rest of the phone number
    if (cellNr.length() != 12) { 
        return false;
    }

    // check remaining characters are digits and not alphabets or any character
    for (int i = 3; i < cellNr.length(); i++) {
        if (!Character.isDigit(cellNr.charAt(i))) {
            return false;
        }
    }

    return true;
}

    public String registerUser() {

    if (!checkUserName()) {
        return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
    }

    if (!checkPasswordComplexity()) {
        return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
    }

    if (!checkCellPhoneNumber()) {
        return "Cell phone number incorrectly formatted or does not contain international code.";
    }

    return "User has been registered successfully.";
}

   public boolean loginUser(String enteredUserName, String enteredPassword) {
    return userName.equals(enteredUserName) && password.equals(enteredPassword);
}


    public String returnLoginStatus(boolean success) {

    if (success) {
        return "Welcome " + firstName + " " + lastName + ", it is great to see you again.";
    } else {
        return "Username or password incorrect, please try again.";
    }
}
    
    
}
