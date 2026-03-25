import java.util.Scanner;
public class Prg11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp=0;
        while(b!=0){
            temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println(a);
    }
}
