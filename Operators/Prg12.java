import java.util.Scanner;
import java.math.*;
public class Prg12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int cycle=sc.nextInt();
        int p=(int)Math.pow(2,cycle);
        int tot=size/p;
        System.out.println(tot);
    }
}
