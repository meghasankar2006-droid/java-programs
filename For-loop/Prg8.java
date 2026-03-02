import java.util.Scanner;
public class Prg8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int qsum=0;
        int dis=0;
        double tsum=0.0;
        double sum=0.0;
        for(int i=0;i<n;i++){
            String proname=sc.next();
            double price=sc.nextDouble();
            int quantity=sc.nextInt();
            qsum=qsum+quantity;
            double s=quantity*price;
            tsum=tsum+s;
        if(quantity==1){
            dis=0;
        } 
        else if(quantity<=4){
            dis=10;
        }
        else if(quantity<=9){
            dis=15;
        }
        else if(quantity>=10){
            dis=20;
        }
        
        double subtotal=price*quantity*(1-dis/100.0);
        sum=sum+subtotal;
        System.out.println("Product: "+proname);
        System.out.println("Unit Price: $"+price);
        System.out.println("Quantity: "+quantity);
        System.out.println("Discount: "+dis+"%");
        System.out.println("Subtotal: $"+subtotal);
        System.out.println(" ");
        
        }
        double tdis=tsum-sum;
        double saving=(tdis/tsum)*100;
        System.out.println("Total Items: "+qsum);
        System.out.println("Original Total: $"+tsum);
        System.out.println("Total Discount: $"+tdis);
        System.out.println("Final Total: $"+sum);
        System.out.printf("Savings: %.2f",saving);
        sc.close();
    }
}
