
/**
 * Write a description of class HospitalTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Date;
public class HospitalTest
{
    public static void main(String[] args) {
        User epsUser = new EpsUser("Jimmy", "Castillo", 13216921,"jimmy.castillo@example.com");
        User policyUser = new PolicyUser("Roberto", "Fields", 61310823,"roberto.fields@example.com");
        User particularUser = new ParticularUser("Rick", "Gonzales", 16428500,"rick.gonzales@example.com");
        
        Hospital hospital = new Hospital();
        
        Speciality speciality1 = new Speciality("General Medicine", 145678, "General");
        Speciality speciality2 = new Speciality("Internal Medicine", 573657, "Internal");
        Speciality speciality3 = new Speciality("Sports Medicine", 573657, "Sport");
        
        hospital.scheduleAppointment(speciality1, epsUser, new Date("9/12/2020"));
        hospital.scheduleAppointment(speciality2, policyUser, new Date("7/9/2021"));
        hospital.scheduleAppointment(speciality3, particularUser, new Date("5/2/2024"));
    }
}
