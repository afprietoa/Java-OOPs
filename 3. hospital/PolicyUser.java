
/**
 * Write a description of class PolicyUser here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PolicyUser extends User
{
    // instance variables - replace the example below with your own
    private String type;

    /**
     * Constructor for objects of class PolicyUser
     */
    public PolicyUser( String name, String lastName, int documentId, String email)
    {
        // initialise instance variables
        super(name, lastName, documentId, email);
        this.type = "POLICY";
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
     * @return Policy User values are printed to the console
     */
    @Override
    public String toString() {
        return super.toString() 
        + "Type =" + this.getType();
    }
}
