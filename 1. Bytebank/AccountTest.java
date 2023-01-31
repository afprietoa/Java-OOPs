
/**
 * Write a description of class AccountTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AccountTest
{
    public static void main(String[] args) {
        Account savingAccount = new Account(new Client("Diego Rojas"));
        savingAccount.deposit(100);
        System.out.println(savingAccount);
    }
}
