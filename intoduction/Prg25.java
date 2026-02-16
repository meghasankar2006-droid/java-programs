import java.util.Scanner;
public class Prg25 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int reusage =sc.nextInt();
        int resrate=sc.nextInt();
        int comusage=sc.nextInt();
        int comrate=sc.nextInt();
        int connection=sc.nextInt();
        int penalty=sc.nextInt();
        int maintainance =sc.nextInt();
        int treatment=sc.nextInt();
        int tot=(reusage*resrate)+(comusage*comrate)+connection+penalty-maintainance-treatment;
        System.out.println(tot);
    }
}
