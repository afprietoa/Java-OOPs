
/**
 * Write a description of class SubpoenaTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SubpoenaTest
{
    public static void main(String[] args) {
        
        Car car = new Car(60,64,80);
        Subpoena carSubpoena =  new Subpoena(car); 
        System.out.println(carSubpoena.BuildTrafficCameraFine(80));
        
        Truck truck = new Truck(70,71,90);
        Subpoena truckSubpoena =  new Subpoena(truck); 
        System.out.println(truckSubpoena.BuildTrafficCameraFine(90));
        
        TractorTrailer tractorTrailer = new TractorTrailer(60,64,80);
        Subpoena tractorTrailerSubpoena =  new Subpoena(car); 
        System.out.println(tractorTrailerSubpoena.BuildTrafficCameraFine(80));
    }
}
