
/**
 * Write a description of class CreditCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.time.LocalDate;

public class CreditCard
{
    // instance variables - replace the example below with your own
    private String cardIssuer;
    private Long cardQuota;
    private String cardNumber;
    private Integer cvcCode;
    private LocalDate expirationDate;

    /**
     * Constructor for objects of class CreditCard
     */
    public CreditCard()
    {
        // initialise instance variables
        
    }
    
    /**
     * Constructor for objects of class CreditCard
     */
    public CreditCard(String cardIssuer, Long cardQuota, String cardNumber, Integer cvcCode, LocalDate expirationDate)
    {
        // initialise instance variables
        this.cardIssuer = cardIssuer;
        this.cardQuota = cardQuota;
        this.cardNumber = cardNumber;
        this.cvcCode = cvcCode;
        this.expirationDate = expirationDate;
    }
    /**
     * 
     * @return     cardIssuer 
     */
    public String getCardIssuer()
    {
        return cardIssuer;
    }
    /**
     * 
     * @param  cardIssuer
     */
    public void setCardIssuer(String cardIssuer)
    {
        this.cardIssuer = cardIssuer;
    }
    /**
     * 
     * @return     cardQuota 
     */
    public Long getCardQuota()
    {
        return cardQuota;
    }
    /**
     * 
     * @param  cardQuota
     */
    public void setCardQuota(Long cardQuota)
    {
        this.cardQuota = cardQuota;
    }
    /**
     * 
     * @return     cardNumber 
     */
    public String getCardNumber()
    {
        return cardNumber;
    }
    /**
     * 
     * @param  cardNumber
     */
    public void setCardNumber(String cardNumber)
    {
        this.cardNumber = cardNumber;
    }
    /**
     * 
     * @return     cvcCode
     */
    public Integer getCvcCode()
    {
        return cvcCode;
    }
    /**
     * 
     * @param  cvcCode
     */
    public void setCvcCode(Integer cvcCode)
    {
        this.cvcCode = cvcCode;
    }
    /**
     * 
     * @return     expirationDate
     */
    public LocalDate getExpirationDate()
    {
        return expirationDate;
    }
    /**
     * 
     * @param  expirationDate
     */
    public void setExpirationDate(LocalDate expirationDate)
    {
        this.expirationDate = expirationDate;
    }
     /**
     * 
     * @return credit card values are printed to the console
     */
     @Override
    public String toString() {
        return "CreditCard \n" 
                + "Card Issuer =" + this.getCardIssuer() + "\n" 
                + "Card Quota =" + this.getCardQuota() + "\n"
                + "Card Number =" + this.getCardNumber() + "\n"
                + "CVC Code =" + this.getCvcCode() + "\n"
                + "expirationDate =" + this.getExpirationDate();
    }
}
