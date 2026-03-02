import java.util.Scanner;
public class Prg10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double subtot=0.0;
        double sum=0.0;
        int qsum=0;
        for(int i=0;i<n;i++){
            String items=sc.next();
            double price=sc.nextDouble();
            int quantity=sc.nextInt();
            qsum=qsum+quantity;
            subtot=price*quantity;
            sum=sum+subtot;
            System.out.println("Item: "+items);
            System.out.println("Price: $"+price+" x "+quantity);
            System.out.println("Subtotal: $"+subtot);
            System.out.println("");
        }
        double tax=(sum*0.08);
        double scharge=sum*0.10;
        double grandtot=sum+tax+scharge;
        System.out.println("Total Items: "+qsum);
        System.out.println("Subtotal: $"+sum);
        System.out.println("Tax (8%): $"+tax);
        System.out.println("Service Charge (10%): $"+scharge);
        System.out.println("Grand Total: $"+grandtot);

    }
}
