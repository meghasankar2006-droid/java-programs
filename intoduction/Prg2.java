import java.util.Scanner;
public class Prg2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int basecost=sc.nextInt();
        int extragb=sc.nextInt();
        int ratepergb=sc.nextInt();
        int tax=sc.nextInt();
        float extra=extragb*ratepergb;
        float total=basecost+extra;
        float bill=(total*tax)/100;
        float tot=total+bill;
        System.out.println(tot);
    }
}
