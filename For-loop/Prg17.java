import java.util.Scanner;
public class Prg17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ucount=0;
        double  rsum=0.0;
        for(int i=1;i<=n;i++){
            String mem=sc.next();
            String mtype=sc.next();
            int edays=sc.nextInt();

            double rfee=0.0;
            if(mtype.equals("Basic")){
                rfee=50.0;
            }
            if(mtype.equals("Premium")){
                rfee=100.0;
            }
            if(mtype.equals("VIP")){
                rfee=200.0;
            }
            
            int dis=0;
            if(edays>=45){
                dis=20;
            }
            else if(edays>=30){
                dis=15;
            }
            else if(edays>=15){
                dis=10;
            }
            else{
                dis=0;
            }
            String priority="";
            if(edays<10){
                priority="Urgent";
                ucount++;
            }
            else if(edays<=30){
                priority="High";
            }
            else if(edays>30){
                priority="Normal";
            }
            double ffee=rfee*(1-(dis/100.0));
            rsum=rsum+ffee;
            System.out.println("Member:"+mem);
            System.out.println("Membership: "+mtype);
            System.out.println("Days Until Expiry: "+edays);
            System.out.println("Renewal Fee: $"+rfee);
            System.out.println("Discount: "+dis+" %");
            System.out.println("Final Fee: $"+ffee);
            System.out.println("Priority: "+priority);
            System.out.println("");
        }
        double avg=rsum/n;
        System.out.println("Total Members: "+n);
        System.out.println("Urgent Renewals:"+ucount);
        System.out.println("Total Renewal Revenue: $"+rsum);
        System.out.println("Average Renewal Fee: $"+avg);
        sc.close();
    }
}
