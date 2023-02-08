
/**
 * Write a description of class Captain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Captain
{
    // instance variables - replace the example below with your own
    private String name;
    private String lastName;
    private String registrationPlate;

    /**
     * Constructor for objects of class Captain
     */
    public Captain(String name, String lastName, String registrationPlate)
    {
        // initialise instance variables
        this.name = name;
        this.lastName = lastName;
        this.registrationPlate = registrationPlate;
    }

     /**
     * 
     * @return captain values are printed to the console
     */
    @Override
    public String toString() {
        return "Captain \n" 
                + "Name =" + name + "\n" 
                + "Last Name =" + lastName + "\n"
                + "Registration Plate =" + registrationPlate;
    }
}
