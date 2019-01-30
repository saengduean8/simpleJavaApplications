package BankAccountApp;

public class Checking extends Account {
    //List properties specific to Checking account
    private int debitCardNumber;
    private int debitCardPin;

    //Constructor to initialize Checking account properties
    public Checking(String name, String ssn, double initDeposit){
        super(name,ssn,initDeposit);
        accountNumber = "2" + accountNumber;

        setDebitCard();
    }

    @Override
    public void setRate(){

        rate = getBaseRate() * .15;
    }

    //List any method specific to the Checking account
    private void setDebitCard(){
        debitCardNumber = (int) (Math.random() * Math.pow(10,12));
        debitCardPin = (int) (Math.random() * Math.pow(10,4));

    }

    public void showInfo(){

        super.showInfo();
        System.out.println(
                "Your checking account features" +
                        "\n Debit card number: " + debitCardNumber +
                        "\n Debit card pin: " + debitCardPin
        );


    }
}
