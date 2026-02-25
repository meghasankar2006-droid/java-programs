import java.util.Scanner;
public class prg3 {
    public static void main(String []args){
       Scanner sc=new Scanner(System.in);
       int s=sc.nextInt();
       int dis=sc.nextInt();
       int g=sc.nextInt();
       int discount=s-((s*dis)/100);
       int gst=discount+((discount*g)/100);
       System.out.println(gst);
    }
}
