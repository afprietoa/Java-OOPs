
/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle
{
    // instance variables - replace the example below with your own
    protected int lowerLimit;
    protected int intermediateLowerLimit;
    protected int upperLimit;
    protected String type;

    /**
     * Constructor for objects of class Vehicle
     */
    public Vehicle(int lowerLimit, int intermediateLowerLimit, int upperLimit)
    {
        // initialise instance variables
        this.lowerLimit = lowerLimit;
        this.intermediateLowerLimit = intermediateLowerLimit;
        this.upperLimit = upperLimit;
    }

    /**
     * 
     * @return     lowerLimit, vehicle lower limit
     */
    public int getLowerLimit()
    {
        return lowerLimit;
    }
    /**
     * 
     * @return     intermediateLowerLimit, vehicle intermediate lower limit
     */
    public int getIntermediateLowerLimit()
    {
        return intermediateLowerLimit;
    }
    /**
     * 
     * @return     upperLimit, vehicle upper limit
     */
    public int getUpperLimit()
    {
        return upperLimit;
    }
    /**
     * 
     * @return     type, vehicle type
     */
    public String getType()
    {
        return type;
    }
}
