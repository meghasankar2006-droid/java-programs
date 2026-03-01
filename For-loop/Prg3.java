import java.util.Scanner;
public class Prg3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int count1=0;
        int sum=0;
        for(int i=0;i<n;i++){
            String proname=sc.next();
            int currentstock=sc.nextInt();
            int minstock=sc.nextInt();
            String status=" ";
            
            if(currentstock>=minstock){
                status="Adequate";
            }
            else if(currentstock<minstock && currentstock<=minstock/2){
                status="Low Stock";
                count++;
            }
            else if(currentstock<minstock){
                status="Critical";
                count1++;
            }
            int reorder=0;
            if(status.equals("Adequate")){
                reorder=0;
            }
            if(status.equals("Low Stock")){
                reorder=(minstock-currentstock+minstock)/2;
            }
            else if(status.equals("Critical")){
                reorder=(minstock-currentstock)+(minstock*(1/2));
            }
            sum=sum+reorder;
            System.out.println(" ");
            System.out.println("Product:"+proname);
            System.out.println("Current Stock: "+currentstock);
            System.out.println("Minimum Stock: "+minstock);
            System.out.println("Status: "+status);
            System.out.println("Reorder Quantity: "+reorder);
        }
        System.out.println(" ");
        System.out.println("Total Products: "+n);
        System.out.println("Low Stock Items:"+count);
        System.out.println("Critical Items: "+count1);
        System.out.println("Total Reorder Quantity: "+sum);
        sc.close();
    }
}
