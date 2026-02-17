import java.util.Scanner;
public class Prg1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int theory=sc.nextInt();
        int practical=sc.nextInt();
        int avg=(theory+practical)/2;
        if(theory>=50 && practical>=50 && avg>=60){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

    }
}