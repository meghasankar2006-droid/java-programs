
import java.util.Scanner;
public class Prg4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int s=sc.nextInt();
        int e=sc.nextInt();
        int l=sc.nextInt();
        int ss=t-((t*s)/100);
        int tot=ss+e+l;
        System.out.println(tot);
    }
}
