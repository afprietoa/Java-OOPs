
/**
 * Write a description of class Black here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.time.LocalDate;
public class Black extends CreditCard
{
    /**
     * Constructor for objects of class Black
     */
    public Black(String cardIssuer, Long cardQuota, String cardNumber, Integer cvcCode, LocalDate expirationDate)
    {
        // initialise instance variables
        super(cardIssuer, cardQuota, cardNumber, cvcCode, expirationDate);
    }}
