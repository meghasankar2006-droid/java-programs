import java.util.Scanner;
public class Prg20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double asum=0.0;
        double wsum=0.0,tsum=0.0,psum=0.0;

        for(int i=1;i<=n;i++){
            String ttype=sc.next();
            double amt=sc.nextDouble();
            String status=" ";
            

            if(ttype.equals("Deposit")){
                status="Credit";
                asum=asum+amt;

            }
            else if(ttype.equals("Withdrawal")){
                status="Debit";
                wsum=wsum+amt;
            }
            else if(ttype.equals("Transfer")) {
                status="Debit";
                tsum=tsum+amt;
            }
            else if(ttype.equals("Payment")) {
                status="Debit";
                psum=psum+amt;
            }

            System.out.println("Transaction "+i+":"+ttype);
            System.out.println("Amount: $"+amt);
            System.out.println("Category: "+status);
            System.out.println("");
        }
        double net=asum-(wsum+tsum+psum);
        System.out.println("Total Transactions: "+n);
        System.out.println("Total Deposits: $"+asum);
        System.out.println("Total Withdrawals: $"+wsum);
        System.out.println("Total Transfers: $"+tsum);
        System.out.println("Total Payments: $"+psum);
        System.out.println("Net Balance Change: $"+net);
        sc.close();

    }
}
