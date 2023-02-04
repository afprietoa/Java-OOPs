
/**
 * Write a description of class Classic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.time.LocalDate;
public class Classic extends CreditCard
{
    /**
     * Constructor for objects of class Classic
     */
    public Classic(String cardIssuer, Long cardQuota, String cardNumber, Integer cvcCode, LocalDate expirationDate)
    {
        // initialise instance variables
        super(cardIssuer, cardQuota, cardNumber, cvcCode, expirationDate);
    }

}
