
/**
 * Write a description of class Sailboat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sailboat extends Boat
{
    // instance variables - replace the example below with your own
    private int numberOfMasts;

    /**
     * Constructor for objects of class Sailboat
     */
    public Sailboat(Captain captain, double basePrice, int fabricationYear, double eslora, int numberOfMasts)
    {
        // initialise instance variables
        super(captain, basePrice, fabricationYear, eslora);
        this.numberOfMasts = numberOfMasts;
    }

    /**
     * 
     * @return     text related to boat size
     */
    public String validateSize()
    {
        return numberOfMasts > 4 ? "The sailboat is big" : "The sailboat isn't big";
    }
     /**
     * 
     * @return sailboat values are printed to the console
     */
    @Override
    public String toString() {
        return "Sailboat \n" 
                + super.toString() + "\n" 
                + "Number of masts =" + numberOfMasts;
    }
}
