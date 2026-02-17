import java.util.Scanner;
public class Prg3 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int hours=sc.nextInt();
    int per=sc.nextInt();
    if(hours>40 && per>90){
        System.out.println("Bonus Eligible");
    }
    else{
        System.out.println("Not eligible");
    }
   } 
}
