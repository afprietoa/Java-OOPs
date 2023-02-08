
/**
 * Write a description of class BoatTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BoatTest
{
    public static void main(String[] args){
        Sailboat sailboat = new Sailboat(new Captain("Horatio", "Hornblower", "MAR321"), 5000, 150, 2021, 8);
        Yacht yacht = new Yacht(new Captain("Patxi", "Barrenetxea", "PAC465"), 9000, 350, 2022, 9);
        
        System.out.println(sailboat);
        System.out.println(sailboat.validateSize() + "\n");
        
        System.out.println(yacht);
        System.out.println(yacht.validateLuxury() + "\n");
    }
}
