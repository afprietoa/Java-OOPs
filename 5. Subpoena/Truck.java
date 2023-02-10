
/**
 * Write a description of class Truck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Truck extends Vehicle
{
    /**
     * Constructor for objects of class Truck
     */
    public Truck(int lowerLimit, int intermediateLowerLimit, int upperLimit)
    {
        // initialise instance variables
        super(lowerLimit, intermediateLowerLimit, upperLimit);
        super.type = "Truck";
    }
}
