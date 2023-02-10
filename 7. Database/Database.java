
/**
 * Write a description of class Database here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Database implements IOperable
{
    // instance variables - replace the example below with your own
    private String databaseURL;
    private String username;
    private String password;

    /**
     * Constructor for objects of class Database
     */
    public Database(String databaseType, String databaseName)
    {
        // initialise instance variables
        databaseURL = "jdbc:"+ databaseType +"://127.0.0.1:3306/" + databaseName;
        username = "root";
        password = "123456";
    }

    /**
     *
     * @param  name,  person name that it wants to save
     * @param  lastName,  person lastname that it wants to save
     * @return message, successful operation
     */
    public String savePerson(String name, String lastName)
    {
        // put your code here
        return "Saving person from ";
    }
}
