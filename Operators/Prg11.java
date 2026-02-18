import java.util.Scanner;
import java.lang.Math;
public class Prg11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int lev=sc.nextInt();
        int cap=(int)Math.pow(2,lev);
        int ans=base*cap;
        System.out.println(ans);   
    }
}

