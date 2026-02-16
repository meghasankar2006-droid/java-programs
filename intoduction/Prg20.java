import java.util.Scanner;
public class Prg20 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int ads=sc.nextInt();
      int sponser=sc.nextInt();
      int affiliate =sc.nextInt();
      int tax=sc.nextInt();
      int production=sc.nextInt();
      int tot=ads+sponser+affiliate-tax-production;
      System.out.println(tot);  
    }
}
