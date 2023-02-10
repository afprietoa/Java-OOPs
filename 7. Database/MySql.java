
/**
 * Write a description of class MySQL here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MySql extends Database
{
    /**
     * Constructor for objects of class MySQL
     */
    public MySql(String databaseType, String databaseName)
    {
        // initialise instance variables
        super(databaseType, databaseName);
    }

    /**
     *
     * @param  name,  person name that it wants to save
     * @param  lastName  person lastname that it wants to save
     * @return message, successful operation
     */
    @Override
    public String savePerson(String name, String lastName)
    {
        // put your code here
        return super.savePerson(name, lastName) + "MySql";
    }
}
