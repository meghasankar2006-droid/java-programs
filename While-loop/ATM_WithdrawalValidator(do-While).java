import java.util.Scanner;
public class Prg6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int bal=sc.nextInt();
        System.out.println("Balance: "+bal);
        boolean valid=false;
        int rem=0;
        do{
            System.out.print("Enter withdrawal amount: ");
            int amt=sc.nextInt();
            if(amt>bal){
                System.out.println("Insufficient funds! Try again");
            }
            else if(amt<=100){
                System.out.println("Invalid amount! Try again.");
            }
            else{
                rem=bal-amt;
                System.out.println("Withdrawal successful! Remaining balance: "+rem);
                valid=true;
    
            }
        }
        while(!valid);

    }
}
