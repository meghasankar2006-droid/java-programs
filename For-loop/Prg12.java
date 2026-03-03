import java.util.Scanner;
public class Prg12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            String vehicle=sc.next();
            double hours=sc.nextDouble();
            double rate=0.0;
            if(hours>8){
                count++;
            }
            if(vehicle.equals("Car")){
                rate=3;
            }
            else if(vehicle.equals("Motorcycle")){
                rate=2;
            }
            else if(vehicle.equals("Truck")){
                rate=5;
            }
            else if(vehicle.equals("Bus")){
                rate=7;
            }
            double fee=hours*rate;
            double dcap=0;
            if(vehicle.equals("Car")){
                dcap=30;
            }
            else if(vehicle.equals("Motorcycle")){
                dcap=20;
            }
            else if(vehicle.equals("Truck")){
                dcap=60;
            }
            else if(vehicle.equals("Bus")){
                dcap=100;
            }
            double pfee=0.0;
            String cap=" ";
            if(fee>dcap){
                pfee=dcap;
                cap="Yes";
            }
            else{
                pfee=fee;
                cap="NO";
            }
            sum=sum+pfee;
            System.out.println("Vehicle 1: "+vehicle);
            System.out.println("Hours Parked: "+hours);
            System.out.println("Hourly Rate: $"+rate);
            System.out.println("Parking Fee: $"+pfee);
            System.out.println("Cap Applied: "+cap);

        }
        double avg=sum/n;
        System.out.println("Total Vehicles: "+n);
        System.out.println("Total Revenue: $"+sum);
        System.out.println("Average Fee: $"+avg);
        System.out.println("Peak Hour Vehicles (>8 hours):"+count);
        sc.close();
    }
}
