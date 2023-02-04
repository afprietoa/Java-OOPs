
/**
 * Write a description of class Platinum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.time.LocalDate;
public class Platinum extends CreditCard
{
    /**
     * Constructor for objects of class Platinum
     */
    public Platinum(String cardIssuer, Long cardQuota, String cardNumber, Integer cvcCode, LocalDate expirationDate)
    {
        // initialise instance variables
        super(cardIssuer, cardQuota, cardNumber, cvcCode, expirationDate);
    }
}
