package BankAccountApp;

public interface IBaseRate {
    //Write a method that return a base interest rate
    default double getBaseRate(){
        return 2.5;
    }
}
