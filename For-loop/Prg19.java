import java.util.Scanner;
public class Prg19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int acount=0;
        int ecount=0;
        int ewcount=0;
        for(int i=0;i<n;i++){
            String proid=sc.next();
            String protype=sc.next();
            int month=sc.nextInt();
            int warrenty=0;
            if(protype.equals("Electronics")){
                warrenty=12;
            }
            if(protype.equals("Appliance")){
                warrenty=24;
            }
            if(protype.equals("Computer")){
                warrenty=36;
            }
        
             int rem=warrenty-month;
             if(rem<0){
                rem=0;
             }
        
            String Status="";
            if(rem==0){
                Status="Expired";
                ewcount++;
            }
            else if(rem>=1 && rem<=3){
                Status="Expiring Soon";
                ecount++;
            }
            else if(rem>3){
                Status="Active";
                acount++;
            }
            System.out.println("Product ID:"+proid);
            System.out.println("Type: "+protype);
            System.out.println("Warranty Period:"+warrenty+ " Months");
            System.out.println("Months Used:"+month);
            System.out.println("Remaining:"+rem);
            System.out.println("Status: "+Status);
            System.out.println("");

        }
        System.out.println("Total Products: "+n);
        System.out.println("Active Warranties:"+acount);
        System.out.println("Expiring Soon: "+ecount);
        System.out.println("Expired Warranties: "+ewcount);
        sc.close();
    }
}
