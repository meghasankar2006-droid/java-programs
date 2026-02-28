import java.util.Scanner;
public class Prg1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int per=0;
        double finalsal=0.0;
        double payroll=0.0;
        for(int i=0;i<n;i++){
            String employee=sc.next();
            double basesal=sc.nextDouble();
            int rating=sc.nextInt();

            if(rating==5){
                per=15;
            }
            else if(rating==4){
                per=10;
            }
            else if(rating==3){
                per=5;
            }
            else if(rating==2){
                per=2;
            }
            else if(rating==1){
                per=0;
            }
            finalsal=basesal*(1+(per/100.0));
            System.out.println("");
            System.out.println("Employee: "+employee);
            System.out.println("Base Salary: &"+basesal);
            System.out.println("Performance Rating: "+rating);
            System.out.println("Increment: "+per+"%");
            System.out.println("Final Salary : $"+finalsal);

            payroll=payroll+finalsal;
        }
        double avg=payroll/n;
         System.out.println("");
        System.out.println("Total Employees Processed: "+n);
        System.out.printf("Total Payroll: $%.2f \n",payroll);
        System.out.printf("Average Salary: $%.2f \n",avg);
    }
}