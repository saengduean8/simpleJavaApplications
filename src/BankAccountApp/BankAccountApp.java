package BankAccountApp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

    public static void main(String[] args){

       List<Account> accounts = new LinkedList<Account>();


        //Create a new account
        /*
        Checking check1 = new Checking("John Smith", "321456789", 1500);
        Saving saving1 = new Saving("Rose Garden", "147852369", 2500);

        saving1.compound();
        check1.showInfo();
        saving1.showInfo();
        */

        //Read a CSV file then create new accounts bases on that data
        String file = "C:/Users/happy/Desktop/NewBankAccounts.csv";

        List<String[]> newAccountHolder = utilities.CSV.read(file);
        for(String[] accountHolder : newAccountHolder){

            String name = accountHolder[0];
            String sSn = accountHolder[1];
            String accountType = accountHolder[2];
            double  initDeposit = Double.parseDouble(accountHolder[3]);

           // System.out.println(name + " " + sSn + " " + accountType + " $" + initDeposit);

            if(accountType.equals("Savings")){
                //System.out.println("Open a Savings account");
                accounts.add(new Saving(name, sSn, initDeposit));
            }
            else if(accountType.equals("Checking")){
               // System.out.println("Open a Checking account");
                accounts.add(new Checking(name, sSn, initDeposit));
            }
            else{
                System.out.println("Error reading account type");
            }
        }
        /*
        access one element in the accounts
        accounts.get(5).showInfo();
        */

        for(Account acc : accounts){
            System.out.println("\n*******************************");
            acc.showInfo();
        }
    }
}
