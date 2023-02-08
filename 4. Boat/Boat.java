
/**
 * Write a description of class Boat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Boat
{
    // instance variables - replace the example below with your own
    protected Captain captain;
    protected double basePrice;
    protected int fabricationYear;
    protected double aditionalValue;
    protected double eslora;
    

    /**
     * Constructor for objects of class Boat
     */
    public Boat(Captain captain, double basePrice, int fabricationYear, double eslora)
    {
        // initialise instance variables
        this.captain = captain;
        this.basePrice = basePrice;
        this.fabricationYear = fabricationYear;
        this.aditionalValue = 20000;
    }

    /**
     * 
     * @return     rent of a boat
     */
    public double calculateRent()
    {
        return fabricationYear > 2020 ? basePrice + aditionalValue : basePrice ;
    }
     /**
     * 
     * @return boat values are printed to the console
     */
    @Override
    public String toString() {
        return  "Captain =" + captain + "\n" 
                + "Rent =" + calculateRent() + "\n"
                + "Fabrication Year =" + fabricationYear;
    }

}
