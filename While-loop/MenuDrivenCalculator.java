import java.util.Scanner;
public class Prg7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice,s,f;
        System.out.println("Calculator Menu:");
        System.out.println("1.Add \n2.Subtract \n3.Multiply \n4.Divide \n5.Exit");
        do{
            System.out.print("choice: ");
            choice=sc.nextInt();
            if(choice==1){
                System.out.print("Enter two numbers :");
                f=sc.nextInt();
                s=sc.nextInt();
                int result=f+s;
                System.out.println("Result: "+result);
            }
            else if(choice==2){
                System.out.print("Enter two numbers :");
                f=sc.nextInt();
                s=sc.nextInt();
                int result=f-s;
                System.out.println("Result: "+result);
            }
            else if(choice==3){
                System.out.print("Enter two numbers :");
                f=sc.nextInt();
                s=sc.nextInt();
                int result=f*s;
                System.out.println("Result: "+result);
            }
            else if(choice==4){
                System.out.print("Enter two numbers :");
                f=sc.nextInt();
                s=sc.nextInt();
                if(s==0){
                    System.out.println("invalid input,second value should not be zero");
                }
                else{
                int result=f/s;
                System.out.println("Result: "+result);
                }
            }
            else if(choice==5){
                System.out.println("Goodbye!");
            }

        }
        while(choice!=5);
        
    }

}
