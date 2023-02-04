
/**
 * Write a description of class AccountTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BankTest
{
    public static void main(String[] args) {
        Account savingAccount = new Account(new Client("Diego Rojas"));
        Account currentAccount = new Account(new Client("Diana Rodriguez"));
        savingAccount.deposit(200);
        currentAccount.deposit(500);
        Bank bank = new Bank(savingAccount, currentAccount);
        
        System.out.println("+----------------------------------+");
        System.out.println("|         WITH TRANSACTION         |");
        System.out.println("+----------------------------------+");
        System.out.println(savingAccount + "\n");
        System.out.println(currentAccount + "\n");
        
        bank.transfer(100);
        
        System.out.println("+----------------------------------+");
        System.out.println("|        WIHOUT TRANSACTION        |");
        System.out.println("+----------------------------------+");
        System.out.println(savingAccount + "\n");
        System.out.println(currentAccount + "\n");
    }
}
