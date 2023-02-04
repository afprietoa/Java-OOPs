
/**
 * Write a description of class Bank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bank
{
    // instance variables - replace the example below with your own
    private Account origin;
    private Account destiny;

    /**
     * Constructor for objects of class Bank
     */
    public Bank(Account origin, Account destiny)
    {
        this.origin = origin;
        this.destiny = destiny;
        
    }

    /**
     * 
     * @param  value: account requested in the transference
     * @param destiny: account to which it want to transfer
     * @return     the boolean value true or false
     */
    public boolean transfer(double value)
    {
        if(origin.getBalance() >= value){
            origin.withdraw(value);
            destiny.deposit(value);
            return true;
        }else{
            return false;
        }
    }
}
