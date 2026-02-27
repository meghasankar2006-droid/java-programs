import java.time.Duration;
import java.util.Scanner;
public class Prg21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String location=sc.next();
        double hours=sc.nextDouble();
        String vehicle=sc.next();
        String memstatus=sc.next();

        double baserate=5.00;
        int premium=0;
        if(location.equals("Downtown")){
            premium=50;
        }
        if(location.equals("Business-District")){
            premium=30;
        }
        if(location.equals("Residential")){
            premium=0;
        }
        if(location.equals("Airport")){
            premium=100;
        }
        double surcharge=0;
        if(vehicle.equals("Motorcycle")){
            surcharge=-2.0;
        }
        if(vehicle.equals("Compact")){
            surcharge=0.0;
        }
        if(vehicle.equals("Sedan")){
            surcharge=0.0;
        }
        if(vehicle.equals("SUV")){
            surcharge=3.0;
        }
        if(vehicle.equals("Oversized")){
            surcharge=5.0;
        }
        double rawfee=(baserate*(1+(premium/100.0))+surcharge)*hours;
        int discount=0;
        if(memstatus.equals("None")){
            discount=0;
        }
        if(memstatus.equals("Monthly")){
            discount=20;
        }
        if(memstatus.equals("Annual")){
            discount=25;
        }
        if(memstatus.equals("VIP")){
            discount=30;
        }

        double finalfee=(rawfee*(1-(discount/100.0)));
        String cap="No";

        double Duration=0.0;

        if(hours>=24){
        if(location.equals("Downtown")){
            Duration=150;
        }
        if(location.equals("Business-District")){
            Duration=120;
        }
        if(location.equals("Residential")){
            Duration=60;
        }
        if(location.equals("Airport")){
            Duration=180;
        }
        cap="Yes";
        }

        String cat=" ";
        if(location.equals("Downtown")){
            cat="premium";
        }
        if(location.equals("Business-District")){
            cat="Premium";
        }
        if(location.equals("Residential")){
            cat="Standard";
        }
        if(location.equals("Airport")){
            cat="Luxury";
        }


        System.out.println("Location Zone: "+location);
        System.out.println("Parking Duration: "+hours);
        System.out.println("Vehicle Type:"+vehicle);
        System.out.println("Membership Status: "+memstatus);
        System.out.println("Base Hourly Rate: $"+baserate);
        System.out.println("Zone Premium: "+premium+"%");
        System.out.println("Vehicle Size Surcharge: $"+surcharge);
        System.out.println("Membership Discount: "+discount+"%");
        System.out.println("Total Parking Fee: $"+finalfee);
        System.out.println("Daily Cap Applied: "+cap);
        System.out.println("Rate Category: "+cat);
    
    }
}
