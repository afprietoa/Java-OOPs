
/**
 * Write a description of class EpsUser here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EpsUser extends User
{
    // instance variables - replace the example below with your own
    private String type;

    /**
     * Constructor for objects of class EpsUser
     */
    public EpsUser( String name, String lastName, int documentId, String email)
    {
        // initialise instance variables
        super(name, lastName, documentId, email);
        this.type = "EPS";
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
     * @return EPS User values are printed to the console
     */
    @Override
    public String toString() {
        return super.toString() 
        + "Type =" + this.getType();
    }
}
