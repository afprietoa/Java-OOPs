
/**
 * Write a description of class ParticularUser here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ParticularUser extends User
{
    // instance variables - replace the example below with your own
    private String type;

    /**
     * Constructor for objects of class ParticularUser
     */
    public ParticularUser( String name, String lastName, int documentId, String email)
    {
        // initialise instance variables
        super(name, lastName, documentId, email);
        this.type = "PARTICULAR";
    }

    /**
     * 
     * @return    user type
     */
    @Override
    public String getType()
    {
        // put your code here
        return type;
    }
     /**
     * 
     * @return Particular User values are printed to the console
     */
    @Override
    public String toString() {
        return super.toString() 
        + "Type =" + this.getType();
    }
}
