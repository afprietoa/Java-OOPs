
/**
 * Write a description of class Client here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Client
{
    // instance variables - replace the example below with your own
    private String name;
    private String document;

    /**
     * Constructor for objects of class Client
     */
    public Client(String name)
    {
        // initialise instance variables
        this.name = name;
    }

    /**
     * 
     * @return     name, holder name 
     */
    public String getName()
    {
        return name;
    }
    /**
     * 
     * @param  name:   holder name
     */
    public void setName(String name)
    {
        this.name = name;
    }
        /**
     * 
     * @return     document, identification number
     */
    public String getDocument()
    {
        return document;
    }
    /**
     * 
     * @param  document:   identification number
     */
    public void setDocument(String document)
    {
        this.document = document;
    }
    /**
     * 
     * @return client values are printed to the console
     */
     @Override
    public String toString() {
        return this.getName();
    }
}
