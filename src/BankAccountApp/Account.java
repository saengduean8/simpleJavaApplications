package BankAccountApp;

public abstract class Account implements IBaseRate {
      // if the class is abstract, we won't be able to create an object for this class but we could create an object
    // from the class that inheritance from this class (this class is a parent class of checking and saving class)

    //List common properties for savings and checking accounts
    private String name;
    private String sSN;
    private double balance;

    static int index = 10000;
    protected String accountNumber;
    protected double rate;



    //Constructor to set base properties and initialize the account
    public Account(String name, String sSN, double initDeposit){

        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;
        //System.out.println("Name: " + name + " \nSSN: " + sSN + " \nBalance: " + initDeposit);

        //Set account number
        index++;
        this.accountNumber = setAccountNumber();

        setRate();

    }

    public abstract void setRate();

    //Generate account number
    private String setAccountNumber(){
        //to get the last two digit of ssn
        int len = sSN.length();
        String lastTwoOfSSN = sSN.substring(len - 2, len);
        int uniqueID = index;
        int randomNumber = (int)(Math.random() * Math.pow(10,3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    public void compound(){
        double accruedInterest = balance * (rate/100);
        balance += accruedInterest;
        System.out.println("Accrued Interest: $" + accruedInterest);
        showBalance();
    }

    //List common methods
    public void deposit(double amount){
        balance += amount;
        System.out.println("Depositing $" + amount);
        showBalance();
    }

    public void withdraw(double amount){
        balance -= amount;
        System.out.println("Withdraw $" + amount);
        showBalance();
    }

    public void transfer(String toWhere, double amount){
        balance -= amount;
        System.out.println("Transfer $" + amount + " to " + toWhere);
        showBalance();
    }

    public void showBalance(){
        System.out.println("Your balance is now $" + balance);
    }

    public void showInfo(){

        System.out.println(
                "Name: " + name +
                "\nAccount Number: " + accountNumber +
                "\nBalance: " + balance +
                "\nRate: " + rate  + "%"
        );
    }



}
