
/**
 * Abstract class User - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class User
{
    // instance variables - replace the example below with your own
    private String name;
    private String lastName;
    private int documentId;
    private String email;

        public User( String name, String lastName, int documentId, String email)
    {
        // initialise instance variables
        this.name = name;
        this.lastName = lastName;
        this.documentId = documentId;
        this.email = email;
    }
    /**
     * Abstract method
     */
    public abstract String getType();
    /**
     * 
     * @return     name 
     */
    public String getName()
    {
        return name;
    }
    /**
     * 
     * @return    last name 
     */
    public String getLastName()
    {
        return lastName;
    }
    /**
     * 
     * @return     document ID 
     */
    public int getDocumentId()
    {
        return documentId;
    }
    /**
     * 
     * @return    email 
     */
    public String getEmail()
    {
        return email;
    }
     /**
     * 
     * @return user values are printed to the console
     */
    @Override
    public String toString() {
        return "User \n" 
                + "Name =" + this.getName() + "\n" 
                + "Last Name =" + this.getLastName() + "\n"
                + "Document ID =" + this.getDocumentId() + "\n"
                + "Email =" + this.getEmail() + "\n";
    }
}
