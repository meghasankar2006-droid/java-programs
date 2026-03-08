import java.util.*;
public class Prg21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int range=sc.nextInt();
        int i=1;
        do{
            System.out.println(num+" x "+i+" = "+(num*i));
            i++;
        }
        while(i<=range);
    }
}
