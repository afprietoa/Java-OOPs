
/**
 * Write a description of class DatabaseTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseTest
{
    public static void main(String[] args) {
        
        MySql mySql = new MySql("mysql", "personService-1");
        PersonService   personservice1 = new PersonService(mySql);
        personservice1.savePerson("Camilo","Mendoza");
        
        Oracle oracle = new Oracle("oracle", "personService-2");
        PersonService   personservice2 = new PersonService(oracle);
        personservice2.savePerson("Juan","Palacios");
        
        SqlServer sqlServer = new SqlServer("sqlserver", "personService-3");
        PersonService   personservice3 = new PersonService(sqlServer);
        personservice3.savePerson("Rosa","Torres");
    }
}
