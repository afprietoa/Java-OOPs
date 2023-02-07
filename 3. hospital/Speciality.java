
/**
 * Write a description of class Speciality here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Speciality
{
    // instance variables - replace the example below with your own
    private String name;
    private int code;
    private String type;

    /**
     * Constructor for objects of class Speciality
     */
    public Speciality(String name, int code, String type)
    {
        // initialise instance variables
        this.name = name;
        this.code = code;
        this.type = type;
    }
    /**
     * 
     * @return    name 
     */
    public String getName()
    {
        return name;
    }
    /**
     * 
     * @return     code
     */
    public int getCode()
    {
        return code;
    }
    /**
     * 
     * @return    type 
     */
    public String getType()
    {
        return type;
    }
     /**
     * 
     * @return user values are printed to the console
     */
    @Override
    public String toString() {
        return "Speciality \n" 
                + "Name =" + this.getName() + "\n" 
                + "Code =" + this.getCode() + "\n"
                + "Type =" + this.getType();
    }

}
