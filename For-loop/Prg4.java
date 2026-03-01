import java.util.Scanner;
public class Prg4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double salesum=0.0;
        double csum=0.0;
        double max=0.0;
        String top=" ";
        for(int i=0;i<n;i++){
            String repname=sc.next();
            double samt=sc.nextDouble();
            if(max<samt){
                max=samt;
               top=repname;
            }
            salesum=salesum+samt;
            int per=0;
            if(samt>=0 && samt<=40000){
                per=5;
            }
            else if(samt<=80000){
                per=8;
            }
            else if(samt<=100000){
                per=10;
            }
            else if(samt<150000){
                per=12;
            }
            else if(samt>=150000){
                per=15;
            }
            double commision=samt*(per/100.0);
            csum=csum+commision;
            double bonus=0.0;
            if(samt>=100000 && samt<150000){
                bonus=2000.0;
            }
            else if(samt>=150000){
                bonus=3000.0;
            }
            double totalpay=commision+bonus;

            System.out.println("Sales Rep:"+repname);
            System.out.println("Sales Amount: $"+samt);
            System.out.println("Commission Rate: "+per+"%");
            System.out.println("Commission Earned: $"+commision);
            System.out.println("Bonus: $"+bonus);
            System.out.println("Total Payout: $"+totalpay);
            System.out.println(" ");
        }
        System.out.println("Total Sales Reps: "+n);
        System.out.println("Total Sales: $"+salesum);
        System.out.println("Total Commissions: $"+csum);
        System.out.println("Top Performer: "+top);
        sc.close();
    }
}
