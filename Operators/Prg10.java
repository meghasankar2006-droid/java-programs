import java.util.Scanner;
public class Prg10 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int units=sc.nextInt();
        int volt=sc.nextInt();
        if(units>500 && volt==1){
            System.out.println("Alert");
        }
        else{
            System.out.println("Normal");
        }
    }
}
