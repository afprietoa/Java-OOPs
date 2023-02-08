
/**
 * Write a description of class Yacht here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Yacht extends Boat
{
    // instance variables - replace the example below with your own
    private int numberOfStaterooms;

    /**
     * Constructor for objects of class Yacht
     */
    public Yacht(Captain captain, double basePrice, int fabricationYear, double eslora, int numberOfStaterooms)
    {
        // initialise instance variables
        super(captain, basePrice, fabricationYear, eslora);
        this.numberOfStaterooms = numberOfStaterooms;
    }

    /**
     * 
     * @return     text related to luxury boat
     */
    public String validateLuxury()
    {
        return numberOfStaterooms > 7 ? "The yacht is luxury" : "The yacht isn't luxury";
    }
     /**
     * 
     * @return yacht values are printed to the console
     */
    @Override
    public String toString() {
        return "Yacht \n" 
                + super.toString() + "\n" 
                + "Number of Staterooms =" + numberOfStaterooms;
    }
}
