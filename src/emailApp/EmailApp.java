package emailApp;

public class EmailApp {

    public static void main(String[] args){

        Email email = new Email("John", "Smith");

       //email.changePassword("hsaee123");
       // System.out.println("Your new password is " + email.getPassword());
       System.out.println(email.showInfo());

    }
}
