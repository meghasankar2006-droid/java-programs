import java.util.Scanner;
public class Prg19 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int days=sc.nextInt();
        int rent=sc.nextInt();
        int late=sc.nextInt();
        int fuel=sc.nextInt();
        int maintainance=sc.nextInt();
        int netval=(days*rent)+late-fuel-maintainance;
        System.out.println(netval);
    }
}
