
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car extends Vehicle
{
    /**
     * Constructor for objects of class Car
     */
    public Car(int lowerLimit, int intermediateLowerLimit, int upperLimit)
    {
        // initialise instance variables
        super(lowerLimit, intermediateLowerLimit, upperLimit);
        super.type = "Car";
    }
}
