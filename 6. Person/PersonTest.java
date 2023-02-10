
/**
 * Write a description of class PersonTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonTest
{
    public static void main(String[] args){
        Boy boy = new Boy("Juan", "Perez", new Adult("Carlos", "Perez", "1425678"));
        
        boy.getAdult().pay();
    }
}
