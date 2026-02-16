import java.util.Scanner;
public class Prg18 {
   public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int regis=sc.nextInt();
    int sponser=sc.nextInt();
    int stall=sc.nextInt();
    int stage=sc.nextInt();
    int celebrity=sc.nextInt();
    int market=sc.nextInt();
    int tot=(regis+sponser+stall)-stage-celebrity-market;
    System.out.println(tot);
   } 
}
