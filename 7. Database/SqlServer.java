
/**
 * Write a description of class SQLServer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SqlServer extends Database
{
    /**
     * Constructor for objects of class SQLServer
     */
    public SqlServer(String databaseType, String databaseName)
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
        return super.savePerson(name, lastName) + "SqlServer";
    }
}
