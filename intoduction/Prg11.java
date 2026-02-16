import java.util.Scanner;
public class Prg11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int distance=sc.nextInt();
        int rate =sc.nextInt();
        int maintenance=sc.nextInt();
        int allowance=sc.nextInt();
        int subsidy=sc.nextInt();
        int tdis=distance*rate;
        int total=(tdis+maintenance+allowance)-subsidy;
        System.out.println(total);
    }
}
