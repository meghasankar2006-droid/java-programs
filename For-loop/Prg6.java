import java.util.Scanner;
public class Prg6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double bal=sc.nextDouble();
        int n=sc.nextInt();
        int count=0;
        double sum=0.0;
        for(int i=1;i<=n;i++){
            double transaction=sc.nextDouble();
            System.out.println("Transaction "+i+":"+transaction);
            if(transaction<bal){
                bal=bal-transaction;
                sum=sum+transaction;
                count++;
                System.out.println("Status: Approved");
            }
            else {
                System.out.println("Status: Denied");
                System.out.println("Reason: Insufficient funds");
            }
            System.out.println("Remaining Balance: $"+bal);
            System.out.println(" ");
        }
        System.out.println("Total Transactions: "+n);
        System.out.println("Successful Withdrawals: "+count);
        System.out.println("Failed Withdrawals: "+(n-count));
        System.out.println("Final Balance: $"+bal);
        System.out.println("Total Withdrawn: $"+sum);
        sc.close();
    }
}
