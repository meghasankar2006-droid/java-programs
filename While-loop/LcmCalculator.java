import java.util.Scanner;
public class Prg18 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int la=a;
       int lb=b;
       while(b>0){
        int temp=b;
        b=a%b;
        a=temp;
       }
       int lcm=(la*lb)/a;
       System.out.println(lcm);
    }
}
