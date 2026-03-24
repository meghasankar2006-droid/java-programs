import java.util.Scanner;
public class Prg3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        while(i>=0){
            System.out.print("Guess the number (1100):");
            int val=sc.nextInt();
            System.out.println(val);
            if(val==num){
                System.out.println("Correct! Attempts: "+i);
                break;
            }
            else if(val>num){
                System.out.println("Too high!");
            }
            else if(val<num){
                System.out.println("Too low!");
            }
            i++;
        }
    }
}
