import java.util.Scanner;
public class Prg5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        float bill=sc.nextFloat();
        float s=sc.nextFloat();
        float g=sc.nextFloat();
        int p=sc.nextInt();
        float service=bill+((bill*s)/100);
        float gst=service+((service*g)/100);
        float share=gst/p;
        System.out.println(share);
    }
}
