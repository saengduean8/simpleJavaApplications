package BankAccountApp;

public class Saving extends Account {
    //List properties specific to the Saving account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    //Constructor to initialize settings for the Saving properties
    public Saving(String name, String ssn, double initDeposit){
        super(name,ssn,initDeposit);
        accountNumber = "1" + accountNumber;

        setSafetyDepositBox();
    }

    @Override
    public void setRate(){

        rate = getBaseRate() - .25;
    }

    //List any methods specific to Saving account
    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10,3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10,4));


    }


    public void showInfo(){
       // System.out.println("Account Type: Saving");
        super.showInfo();
        System.out.println(
                "Your saving account features" +
                        "\n Safety Deposit Box ID: " + safetyDepositBoxID +
                        "\n Safety Deposit Box key: " + safetyDepositBoxKey

        );

    }
}
