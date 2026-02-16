import java.util.Scanner;
public class Prg10 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int  deliveries=sc.nextInt();
       int payout=sc.nextInt();
       int incentive=sc.nextInt();
       int fuelcost=sc.nextInt();
       int earnings=(deliveries*payout)+incentive;
       int tot=earnings-fuelcost;
       System.out.println(tot);
    }
}
