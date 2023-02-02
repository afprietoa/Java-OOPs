
/**
 * Write a description of class Account here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Account
{
    // instance variables 
    private double balance;
    private int number;
    private Client holder;
    private int idx = 0;
    
    static double min = 1e9;
    static double max = 2e9;
    static double range = max - min + 1;
    
    private static int total;
    /**
     * Constructor for objects of class Account
     */
    public Account(Client holder)
    {
        // initialise instance variables
        this.holder = holder;
        this.number = (int) ((Math.random()*range) + min);
        this.balance = 0;
        Account.total ++;
        this. idx +=  Account.total;
    }

    /**
     * 
     * @param  value: account requested at withdrawal
     * @return     the boolean value true or false
     */
    public boolean withdraw(double value)
    {
        if(this.balance >= value){
             this.balance -= value;
             return true;
        }else{
            return false;            
        }

    }
    /**
     * 
     * @param  value: account requested in the deposit 
     */
    public void deposit(double value)
    {
        this.balance = this.balance + value;
    }
    /**
     * 
     * @return     balance value
     */
    public double getBalance()
    {
        return balance;
    }
    /**
     * 
     * @return     account number
     */
    public int getNumber()
    {
        return number;
    }
    /**
     * 
     * @return     account holder
     */
    public Client getHolder()
    {
        return holder;
    }
    /**
     * 
     * @return     account index
     */
    public int getIdx()
    {
        return idx;
    }
    /**
     * 
     * @return     account total
     */
    public static int getTotal()
    {
        return Account.total;
    }
     /**
     * 
     * @return account values are printed to the console
     */
     @Override
    public String toString() {
        return "Account #" + this.getIdx() +"\n" 
                + "Balance=" + this.getBalance() + "\n" 
                +"Number=" + this.getNumber() + "\n" 
                +"Holder=" + this.getHolder();
    }
}
