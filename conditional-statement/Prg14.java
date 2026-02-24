import java.util.Scanner;
public class Prg14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String tier=sc.next();
        int months=sc.nextInt();
        String level=sc.next();
        String addons=sc.next();

        double base=0.0;
        if(tier.equals("Basic")){
            base=40.0;
        }
        else if(tier.equals("Premium")){
            base=80.0;
        }
        else if(tier.equals("Elite")){
            base=15.0;
        }
        else if(tier.equals("VIP")){
            base=150.0;
        }
        //discount
        int discount=0;
        if(months==1){
            discount=0;
        }
        else if(months==6){
            discount=10;
        }
        else if(months==12){
            discount=15;
        }
        else if(months==24){
            discount=25;
        }
        //fees
        double fees=0.0;
        if(level.equals("Single-Location")){
            fees=0.0;
        }
        else if(level.equals("Regional")){
            fees=20.0;
        }
        else if(level.equals("Nationwide")){
            fees=50.0;
        }
        //addfees
        double addfees=0.0;
        if(addons.equals("None")){
            addfees=0.0;
        }
        else if(addons.equals("Personal-Training")){
            addfees=100.0;
        }
        else if(addons.equals("Classes")){
            addfees=50.0;
        }
        else if(addons.equals("Full-Package")){
            addfees=200.0;
        }
        double disbase=base*(1-(discount/100.0));
        double monthlytot=disbase+fees+addfees;
        double contracttot=monthlytot*months;
        double savings=(base+fees+addfees)*months-contracttot;

        String category=" ";
        if(tier.equals("Basic")){
            category="budget";
        }
        else if(tier.equals("Premium")){
            if(months==12){
                category="premium";
            }
            else{
                category="Standard";
            }
        }
        else if(tier.equals("Elite")){
            category="premium";
        }
        else if(tier.equals("VIP")){
            category="Luxury";
        }

        System.out.println("Membership Tier:"+tier);
        System.out.println("Contract Length:"+months+" Months");
        System.out.println("Access Level: "+level);
        System.out.println("Add-Ons: "+addons);
        System.out.println("Base Monthly Fee: $"+base);
        System.out.println("Contract Discount: "+discount+"%");
        System.out.println("Access Fee: $"+fees);
        System.out.println("Add-On Fee: $"+addfees);
        System.out.println("Monthly Total: $"+monthlytot);
        System.out.println("Contract Total: $"+contracttot);
        System.out.println("Savings vs Month-to-Month: $"+savings);
        System.out.println("Membership Category: "+category);



    }
}
