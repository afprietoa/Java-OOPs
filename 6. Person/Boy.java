
/**
 * Write a description of class Boy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Boy extends Person
{
    // instance variables - replace the example below with your own
    private Adult adult;

    /**
     * Constructor for objects of class Boy
     */
    public Boy(String name, String lastName, Adult adult)
    {
        // initialise instance variables
        super(name, lastName);
        this.adult = adult;
    }
    /**
     * 
     * @return     adult, adult have responsability of invoce payment of boy
     */
    public Adult getAdult()
    {
        return adult;
    }
     /**
     * 
     * @return Boy values are printed to the console
     */
    @Override
    public String toString()
    {
        // put your code here
          return "Boy \n" 
                + super.toString();
    }
}
