package emailApp;

import java.util.Scanner;

public class Email {

   private String fristName;
   private String lastName;
   private String email;
   private String password;
   private String department;
   private String alternateEmail;
   private String companySuffix = "aeycompany.con";
   private int mailboxCapacity = 500;
   private int defaultPasswordLength = 8;

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.fristName = firstName;
        this.lastName = lastName;

       // System.out.println("Email Created: " + this.fristName + " " + this.lastName);

        // call a method asking for the department- return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        //call a method that return a random password
        this.password = randomePassword(defaultPasswordLength);
        System.out.println("Your password is " + this.password);

        //combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your email is: " + email);
    }

    // Ask for the department
    private String setDepartment(){
        System.out.println("Department Code:\n1 for Sale\n2 for Development\n3 for Accounting\n0 for none\nEnter the department code");
        Scanner input = new Scanner(System.in);
        int deptChoice = input.nextInt();

        /*
        if(deptChoice == 1) {
            return "Sale";
        }else if(deptChoice == 2){
            return "Development";
        }else if(deptChoice == 2){
            return "Accountant" ;
        }else{
            return "";
        }
        */
        String str = "";
        switch(deptChoice){
            case 1: str = "Sale";
            break;

            case 2: str = "Development";
            break;

            case 3: str = "Accountant";
            break;

            case 0: str = "none";
            break;
            default:
                System.out.println("Invalid department code");
        }
        return str;
    }


    // Generate a random password
    private String randomePassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];

        for(int i = 0; i < length;i++){
          int rand =  (int)(Math.random() * passwordSet.length());
          password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    // Set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }
    // Change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity(){
        return mailboxCapacity;
    }

    public String getAlternateEmail(){
        return alternateEmail;
    }

    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "Display Name: " + fristName + " " + lastName + "\nCompany Email: " + email + "\nMailbox Capacity: " + mailboxCapacity;
    }


}

