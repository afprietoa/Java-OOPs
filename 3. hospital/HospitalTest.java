
/**
 * Write a description of class HospitalTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Date;
import java.text.SimpleDateFormat;
public class HospitalTest
{
    static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    public static void main(String[] args) throws  java.text.ParseException {
        User epsUser = new EpsUser("Jimmy", "Castillo", 13216921,"jimmy.castillo@example.com");
        User policyUser = new PolicyUser("Roberto", "Fields", 61310823,"roberto.fields@example.com");
        User particularUser = new ParticularUser("Rick", "Gonzales", 16428500,"rick.gonzales@example.com");
        
        System.out.println(epsUser + "\n");
        System.out.println(policyUser + "\n");
        System.out.println(particularUser + "\n");
        
        Hospital hospital = new Hospital();
        
        System.out.println(hospital + "\n");
        
        Speciality speciality1 = new Speciality("General Medicine", 145678, "General");
        Speciality speciality2 = new Speciality("Internal Medicine", 573657, "Internal");
        Speciality speciality3 = new Speciality("Sports Medicine", 573657, "Sport");
        
        System.out.println(speciality1 + "\n");
        System.out.println(speciality2 + "\n");
        System.out.println(speciality3 + "\n");
        
        System.out.println(hospital.scheduleAppointment(speciality1, epsUser, dateFormat.parse("08/07/2019")) + "\n");
        System.out.println(hospital.scheduleAppointment(speciality2, policyUser, dateFormat.parse("05/02/2021")) + "\n");
        System.out.println(hospital.scheduleAppointment(speciality3, particularUser, dateFormat.parse("11/12/2023")) + "\n");
    }
}
