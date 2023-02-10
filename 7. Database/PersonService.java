
/**
 * Write a description of class PersonService here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonService
{
    // instance variables - replace the example below with your own
    private Database database;

    /**
     * Constructor for objects of class PersonService
     */
    public PersonService(Database database)
    {
        // initialise instance variables
        this.database = database;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void savePerson(String name, String lastName)
    {
        // put your code here
        System.out.println(database.savePerson(name, lastName));
    }
}
