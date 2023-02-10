
/**
 * Write a description of class Adult here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Adult extends Person
{
    // instance variables - replace the example below with your own
    private String dni;

    /**
     * Constructor for objects of class Adult
     */
    public Adult(String name, String lastName, String dni)
    {
        // initialise instance variables
        super(name, lastName);
        this.dni = dni;
    }
    /**
     *
     * @return    Scheduled Appointment
     */
    public void pay()
    {
        // put your code here
         System.out.println("Invoice payment was successful"); 
    }
     /**
     * 
     * @return Adult values are printed to the console
     */
    @Override
    public String toString()
    {
        // put your code here
          return "Adult \n" 
                + super.toString() + "\n"  
                + "DNI Name = " + dni;
    }
}
