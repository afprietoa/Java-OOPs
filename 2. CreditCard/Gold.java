
/**
 * Write a description of class Gold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.time.LocalDate;
public class Gold extends CreditCard
{
    /**
     * Constructor for objects of class Gold
     */
    public Gold(String cardIssuer, Long cardQuota, String cardNumber, Integer cvcCode, LocalDate expirationDate)
    {
        // initialise instance variables
        super(cardIssuer, cardQuota, cardNumber, cvcCode, expirationDate);
    }
}
