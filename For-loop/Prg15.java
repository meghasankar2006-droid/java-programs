import java.util.Scanner;
public class Prg15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double tsum=0.0;
        double rtot=0.0;
        for(int i=0;i<n;i++){
            double distance=sc.nextDouble();
            String time=sc.next();
            tsum=tsum+distance;
            double base=3.00;
            double dcharge=distance*1.00;

            double surcharge=0.0;
            if(time.equals("Morning")){
                surcharge=0.0;
            }
            if(time.equals("Afternoon")){
                surcharge=0.0;
            }
            if(time.equals("Evening")){
                surcharge=3.0;
            }
            if(time.equals("Night")){
                surcharge=5.0;
            }
            double totf=base+dcharge+surcharge;
            rtot=rtot+totf;
            System.out.println("Ride "+(i+1));
            System.out.println("Distance: "+distance+" km");
            System.out.println("Time: "+time);
            System.out.println("Base Fare: $"+base);
            System.out.println("Distance Charge: $"+dcharge);
            System.out.println("Time Surcharge: $"+surcharge);
            System.out.println("Total Fare: $"+totf);
            System.out.println("");
        }
        double avg=rtot/n;
        System.out.println("Total Rides: "+n);
        System.out.println("Total Distance:"+tsum+" Km");
        System.out.println("Total Revenue: $"+rtot);
        System.out.println("Average Fare: $"+avg);
        sc.close();
    }
}
