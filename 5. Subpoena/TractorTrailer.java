
/**
 * Write a description of class TractorTrailer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TractorTrailer extends Vehicle
{
    /**
     * Constructor for objects of class TractorTrailer
     */
    public TractorTrailer(int lowerLimit, int intermediateLowerLimit, int upperLimit)
    {
        // initialise instance variables
        super(lowerLimit, intermediateLowerLimit, upperLimit);
        super.type = "Tractor-trailer";
    }
}
