
/**
 * Write a description of class Subpoena here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Subpoena
{
    private Vehicle vehicle;

    public Subpoena(  Vehicle vehicle) {

        this.vehicle = vehicle;
    }


    public String BuildTrafficCameraFine(int velocity) {
        int subpoenaValue = calculateSubpoena(velocity);
        String emailText = sendEmailOfTrafficCameraFine();
        return subpoenaValue == -1 
        ? "There is not calculation for the type of vehicle" + vehicle.getType() + "email: " + emailText
        : "----The type of subpoena is: " + subpoenaValue + " ----email body" + emailText;

    }

    public int calculateSubpoena(int velocity) {

        if(vehicle.getType() =="Car" || vehicle.getType() =="Tractor-trailer" || vehicle.getType() =="Truck") {
            if(velocity<=vehicle.getLowerLimit()) {
                return 0;
            }else if (velocity >=vehicle.getIntermediateLowerLimit() && velocity<=vehicle.getUpperLimit()) {
                return 1;
            }
            return 2;
        }

        return -1;
    }


    public String sendEmailOfTrafficCameraFine() {

        if(vehicle.getType() =="Car" || vehicle.getType() =="Tractor-trailer" || vehicle.getType() =="Truck") {
            String bodyMail = "//Sending email for the type of " + vehicle.getType() + ".";
            String mailSubject = "//mail subject: " + vehicle.getType() + " subpoena.";
            return   mailSubject + bodyMail;
        }else {
            return "Sending email with weird vehicle";
        }
    }
}
