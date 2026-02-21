import java.util.Scanner;
public class Prg6 {
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String bookingclass=sc.next();
    int days=sc.nextInt();
    double seat=sc.nextDouble();
    String routeType=sc.next();
    double base=0.0;
  if(bookingclass.equals("Economy")){
    if(routeType.equals("Domestic")){
      base=200.0;
    }
    else if(routeType.equals("International-Short")){
      base=500.0;
    }
    else if(routeType.equals("International-Long")){
      base=800.0;
    }
  }  
  if(bookingclass.equals("Business")){
    if(routeType.equals("Domestic")){
      base=600.0;
    }
    else if(routeType.equals("International-Short")){
      base=1500.0;
    }
    else if(routeType.equals("International-Long")){
      base=2500.0;
    }
  } 
  if(bookingclass.equals("First")){
    if(routeType.equals("Domestic")){
      base=1000.0;
    }
    else if(routeType.equals("International-Short")){
      base=3000.0;
    }
    else if(routeType.equals("International-Long")){
      base=5000.0;
    }
  } 
  double multiplier=0.0;
  String demand=" ";

  if(seat<30 && days<14){
    multiplier=1.8;
    demand="High demand";
  }
  else if(seat<50 && days<30){
    multiplier=1.5;
    demand="High demand";
  }
  if(seat<60 || (days>30 && days<60)){
    multiplier=1.0;
    demand="Moderate";
  }
  if(seat>=60 && days>60){
    multiplier=0.8;
    demand="Low demand";
  }
  double finalprice=base*multiplier;

  System.out.println("Booking Class:"+bookingclass);
  System.out.println("Days Until Departure:"+days);
  System.out.println("Seat Availability"+seat+"%");
  System.out.println("Route Type:"+routeType);
  System.out.println("Base Price: $"+base);
  System.out.println("Demand Multiplier: "+ multiplier+"X");
  System.out.println("Final Ticket Price: $"+finalprice);
  System.out.println("Pricing Category:"+demand);
  
  }  
}
