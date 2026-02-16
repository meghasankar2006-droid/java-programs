import java.util.Scanner;
public class Prg21 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int maintainance=sc.nextInt();
        int parking=sc.nextInt();
        int hall=sc.nextInt();
        int security=sc.nextInt();
        int electricity=sc.nextInt();
        int cleaning=sc.nextInt();
        int tot=maintainance+parking+hall-security-electricity-cleaning;
        System.out.println(tot);
        
    }
}
