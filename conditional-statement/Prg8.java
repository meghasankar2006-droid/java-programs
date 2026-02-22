import java.util.Scanner;
public class Prg8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String tier=sc.next();
        int footage=sc.nextInt();
        int age=sc.nextInt();
        int score=sc.nextInt();
        int baseprice=0;
        if(tier.equals("Prime")){
            baseprice=400;
        }
        else if(tier.equals("Urban")){
            baseprice=300;
        }
        else if(tier.equals("Suburban")){
            baseprice=180;
        }
        else if(tier.equals("Rural")){
            baseprice=100;
        }
        int adjustment=0;
        if(age>=0 && age<=5){
            adjustment=0;
        }
        else if(age>=6 && age<=10){
            adjustment=-5;
        }
        else if(age>10 && age<=15){
            adjustment=-10;
        }
        else if(age>=16 && age<=25){
            adjustment=-15;
        }
        else if(age>25 && age<=30){
            adjustment=-20;
        }
        else if(age>30 && age<=50){
            adjustment=-25;
        }
        else{
            adjustment=-35;
        }
        int basevalue=footage*baseprice;
        System.out.println(basevalue);
        double amenitybonus=0.0;
        if(score>=80 && score<=100){
            amenitybonus=((basevalue*10)/100);
            
        }
        else if(score>=60 && score<=79){
            amenitybonus=((basevalue*5)/100);
        }
        else if(score>=40 && score<=59){
            amenitybonus=((basevalue*2)/100);
        }
        else{
           amenitybonus=((basevalue*0)/100); 
        }
        
        double adjustmentvalue =basevalue*(1+(adjustment/100));
        double finalvalue=adjustmentvalue+amenitybonus;
        
        String market=" ";
        if((tier.equals("Prime")|| tier.equals("Urban")) && age<=15){
            market="Hot";
        }
        else if(tier.equals("Suburban")){
            market="Stable";
        }
        else if(tier.equals("Rural")||age>30){
            market="Slow";
        }
        System.out.println("Location Tier: "+tier);
        System.out.println("Square Footage: "+footage);
        System.out.println("Property Age:  "+age);
        System.out.println("Amenity Score: "+score);
        System.out.println("Base Price Per Sq Ft: "+baseprice);
        System.out.println("Age Adjustment: "+adjustment);
        System.out.println("Amenity Bonus: "+amenitybonus);
        System.out.println("Estimated Property Value: "+finalvalue);
        System.out.println("Market Category: "+market);
    }
} 