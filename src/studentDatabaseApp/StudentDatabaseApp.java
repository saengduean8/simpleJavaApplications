package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args){

        //Ask how many new users we want to add
        System.out.println("Enter number of new students to enroll: ");
        Scanner input = new Scanner(System.in);
        int numOfStudent = input.nextInt();
        Student[] students = new Student[numOfStudent];

        //Create n number of new students
        for(int i = 0; i < numOfStudent; i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].showInfo()); 
        }
    }
}
