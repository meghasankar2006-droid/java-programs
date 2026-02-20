import java.util.Scanner;
public class Prg3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        String smoke=sc.next();
        String pre=sc.next();
        String tier=sc.next();
        double base=0.0;
        if(tier.equals("Basic")){
            if(age>18 &&age<30){
                base=200;
            }
            else if(age>30 &&age<51){
                base=250;
            }
            else if(age>50 &&age<66){
                base=350;
            }
            else if(age>=66){
                base=400;
            }  
        }
        else if(tier.equals("Standard")){
            if(age>18 &&age<30){
                base=300;
            }
            else if(age>30 &&age<51){
                base=350;
            }
            else if(age>50 &&age<66){
                base=450;
            }
            else if(age>=66){
                base=550;
            }   
        }
        else if(tier.equals("Premium")){ 
            if(age>18 &&age<30){
                base=500;
            }
            else if(age>30 &&age<51){
                base=600;
            }
            else if(age>50 &&age<66){
                base=700;
            }
            else if(age>=66){
                base=800;
            }    
        }
        
    double risk=0.0;
    if(smoke.equals("Smoker") && pre.equals("No")){
        risk=(base *40)/100;
    }
    else if(smoke.equals("Non-Smoker") && pre.equals("Yes")){
        risk=(base *30)/100;
    }
    else if(smoke.equals("Smoker") && pre.equals("Yes")){
        risk=(base *70)/100;
    }
    System.out.println("Age:"+age);
    System.out.println("Smoking Status:"+smoke);
    System.out.println("Pre-existing Conditions: "+pre);
    System.out.println("Coverage Tier:"+tier);
    System.out.println("Base Premium: $"+base);
    System.out.println("Risk Surcharge: $"+risk);
    System.out.println("Total Monthly Premium: $"+(risk+base));
    }
}
