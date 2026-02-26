import java.util.Scanner;
public class Prg20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int gb=sc.nextInt();
        int usercount=sc.nextInt();
        String backup=sc.next();
        String stier=sc.next();

        double base =0.0;
        if( gb<=100){
            base=gb*0.05;
        }
        if(gb>100 && gb<=500){
            base=(100*0.05)+((gb-100)*0.04)+5;
        }
        if(gb>500 &&  gb<=2000){
            base=(100*0.05)+(400*0.04)+((gb-500)*0.03);
        }
        if(gb>2000){
            base=((gb-2000)*0.02)+140;
        }
        double userfee=0.0;
        if(usercount>=1 && usercount<=10){
            userfee=usercount*5.0;
        }
        else if(usercount>=11 && usercount<=50){
            userfee=usercount*4.0;
        }
        else if(usercount>=51){
            userfee=usercount* 3.0+100;
        }
        double pre=0.0;
        if(backup.equals("Daily")){
            pre=0.0;
        }
        else if(backup.equals("Hourly")){
            pre=(15)+(usercount*0.5);
        }
        else if(backup.equals("Real-Time")){
            pre=(50)+(usercount*1);
        }
        double fee=0.0;
        if(stier.equals("Community")){
            fee=0.0;
        }
        else if(stier.equals("Standard")){
            fee=20.0;
        }
        else if(stier.equals("Priority")){
            fee=75.0;
        }
        else if(stier.equals("Enterprise")){
            fee=200.0;
        }
        double monthlytot=base+userfee+pre+fee;
        double annual=monthlytot*12*0.9;

        String plan=" ";
        if (usercount==1){
            plan="Personal";
        }
        else if(usercount>=2 && usercount<=20){
            plan="Team";
        }
        else if(usercount>=21 && usercount<=100){
            plan="Business";
        }
        else{
            plan="Enterprise";
        }

        String features=" ";
        if(plan.equals("Personal")){
            features="Basic storage, file sync";
        }
        if(plan.equals("Team")){
            features="Included Features: Version history, file sharing, basic analytics";
        }
        if(plan.equals("Business")){
            features="Advanced sharing, team analytics, priority support.";
        }
        if(plan.equals("Enterprise")){
            features=" Advanced security, compliance tools, dedicated support, API access";
        }



        System.out.println("Storage Capacity:"+gb);
        System.out.println("User Count:"+usercount);
        System.out.println("Backup Frequency:"+backup);
        System.out.println("Support Tier: "+stier);
        System.out.println("Base Storage Cost: $"+base);
        System.out.println("Per-User Fee: $"+userfee);
        System.out.println("Backup Premium: $"+pre);
        System.out.println("Support Fee: $"+fee);
        System.out.println("Monthly Subscription: $"+monthlytot);
        System.out.println("Annual Subscription: $"+annual);
        System.out.println("Recommended Plan: "+plan);
        System.out.println("Included Features: "+features);
       sc.close();
    }
}
