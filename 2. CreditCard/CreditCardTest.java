
/**
 * Write a description of class CreditCardTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.time.LocalDate;
public class CreditCardTest
{
    public static void main(String[] args) {
        // put your code here
        CreditCard classic = new Classic("Visa", 6522L, "4539605701681916", 239, LocalDate.ofYearDay(2023, 5));
        CreditCard gold = new Gold("Mastercard", 2439L, "5343185836770093", 6750, LocalDate.ofYearDay(2032, 7));
        CreditCard platinum = new Platinum("American Express", 6533L, "371732730850251", 126, LocalDate.ofYearDay(2032, 10));
        CreditCard black = new Black("Discover", 1715L, "6011849931552677", 610, LocalDate.ofYearDay(2029, 7));

        System.out.println("+----------------------------------+");
        System.out.println("|       Classic Credit Card        |");
        System.out.println("+----------------------------------+");
        System.out.println(classic + "\n");
        
        System.out.println("+----------------------------------+");
        System.out.println("|       Gold Credit Card           |");
        System.out.println("+----------------------------------+");
        System.out.println(gold + "\n");
        
        System.out.println("+----------------------------------+");
        System.out.println("|       Platinum Credit Card       |");
        System.out.println("+----------------------------------+");
        System.out.println(platinum + "\n");
        
        System.out.println("+----------------------------------+");
        System.out.println("|       Black Credit Card          |");
        System.out.println("+----------------------------------+");
        System.out.println(black + "\n");
    }
}
