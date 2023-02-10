
/**
 * Write a description of interface ISaveable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface IOperable
{
    /**
     *
     * @param  name,  person name that it wants to save
     * @param  lastName  person lastname that it wants to save
     * @return message, successful operation
     */
    public String savePerson(String name, String lastName);
}
