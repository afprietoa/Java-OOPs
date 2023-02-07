
/**
 * Write a description of class hospital here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Date;
import java.text.SimpleDateFormat;
public class Hospital
{
    // instance variables - replace the example below with your own
    private int baseValueToPay;
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    /**
     * Constructor for objects of class hospital
     */
    public Hospital()
    {

    }
    /**
     * 
     * @return     base value to pay
     */
    public int getBaseValueToPay()
    {
        return baseValueToPay;
    }
    /**
     * 
     * @return     base value to pay
     */
    public void calculateBaseValueToPay(User user)
    {
        switch(user.getType())
        {
            case "EPS":
                this.baseValueToPay = 30000;
                break;
            case "POLICY":
                this.baseValueToPay = 40000;
                break;
            case "PARTICULAR":
                this.baseValueToPay = 70000;
                break;
            default:
                this.baseValueToPay = 0;
        }
    }

    /**
     *
     * @param  speciality,  medical speciality type
     * @param  user,  patient
     * @param  date,  appointment date
     * @return    Scheduled Appointment
     */
    public String scheduleAppointment(Speciality speciality, User user, Date date)
    {
        
        calculateBaseValueToPay(user);
        // put your code here
         return "Scheduled Appointment \n" 
                + "Speciality =" + speciality + "\n" 
                + "User =" + user + "\n"
                + "Date =" + date + "\n"
                + "Value =" + this.getBaseValueToPay(); 
    }
}
