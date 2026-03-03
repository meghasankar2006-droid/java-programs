import java.util.Scanner;
public class Prg11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double sum=0.0;
        double d=0.0;
        double tot=0.0;
        for(int i=0;i<n;i++){
            String seattype=sc.next();
            String custype=sc.next();
            double baseprice=0.0;

            if(seattype.equals("Regular")){
                baseprice=12;
            }
            else if(seattype.equals("Premium")){
                baseprice=18;
            }
            else if(seattype.equals("Recliner")){
                baseprice=25;
            }
            sum=sum+baseprice;
            int dis=0;
            if(custype.equals("Adult")){
                dis=0;
            }
            else if(custype.equals("Child")){
                dis=30;
            }
            else if(custype.equals("Senior")){
                dis=25;
            }
            double ticket=baseprice*(1-(dis/100.0));
            tot=tot+ticket;
            System.out.println("Ticket "+seattype+"-"+custype);
            System.out.println("Base Price: $"+baseprice);
            System.out.println("Discount: "+dis+"%");
            System.out.printf("Final Price: $ %.1f \n",ticket);
            System.out.println("");
    
        }
    
        System.out.println("Total Tickets: "+n);
        System.out.println("Original Total: $"+sum);
        
        if(n>=5){
            double g=tot*(10/100.0);
            tot=tot-g;
            d=sum-tot;
            System.out.printf("Total Discount: $ %.1f \n",d);
            System.out.printf("Final Total: $ %.1f \n",tot);
        System.out.println("Group Discount Applied: yes");
        }
        else{
             d=sum-tot;
            System.out.printf("Total Discount: $ %.1f \n",d);
            System.out.printf("Final Total: $ %.1f \n",tot);
            System.out.println("Group Discount Applied: No");

        }
        sc.close();
    }
}
