
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    // instance variables - replace the example below with your own
    private String name;
    private String lastName;

    /**
     * Constructor for objects of class Person
     */
    public Person(String name, String lastName)
    {
        // initialise instance variables
        this.name = name;
        this.lastName = lastName;
    }

     /**
     * 
     * @return Person values are printed to the console
     */
    @Override
    public String toString()
    {
        // put your code here
          return "Captain \n" 
                + "Name =" + name + "\n" 
                + "Last Name =" + lastName + "\n";
    }
}
