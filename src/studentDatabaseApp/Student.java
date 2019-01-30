package studentDatabaseApp;

import java.util.Scanner;

public class Student {

   private String firstName;
   private String lastName;
   private int gradeYear;
   private String studentID;
   private String courses = "";
   private int tuitionBalance = 0;
   private static int costOfCourses = 600; // a static value will true for all objects
    private static int id = 1000;
   //Constructor: prompt user to enter name and year
    public Student(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = input.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = input.nextLine();

        System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = input.nextInt();

        /*
        String str = "";
        if(gradeYear == 1){
            str = "Freshman";
        }
        else if(gradeYear == 2){
            str = "Sophmore";
        }
        else if(gradeYear == 3){
            str = "Junior";
        }
        else if(gradeYear == 4) {
            str = "Senior";
        }
        */

        setStudentID();


    }

    //Generate an ID: grade level + ID
    private void setStudentID(){
        id++;
       this.studentID =  gradeYear + "" + id;
    }

    //Enroll in courses
    public void enroll() {
        do {
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner input = new Scanner(System.in);
            String course = input.nextLine();

            if (!course.equals("Q")) {
                courses = courses + "\n\t" + course;
                tuitionBalance += costOfCourses;
            } else {
                break;
            }
        } while (1 != 0);


    }

    //View balance
    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    //Pay Tuition
    public void payTuition(){
        viewBalance();
        System.out.println("Enter your payment amount: $");
        Scanner input = new Scanner(System.in);
        int payment = input.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    //Show status
    public String showInfo(){
        return "Name: " + firstName + " " + lastName + "\nGrade level: " + gradeYear +
                 "\nStudent ID: " + studentID + "\nCourses Enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }
}
