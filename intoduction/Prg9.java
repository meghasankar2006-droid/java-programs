import java.util.Scanner;
public class Prg9 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in); 
    int roomCharge=sc.nextInt();
    int days=sc.nextInt();
    int medicineCost=sc.nextInt();
    int labFees=sc.nextInt();
    int insuranceCoverage=sc.nextInt();
    int roomfees=roomCharge*days;
    int tot=(medicineCost+labFees+roomfees)-insuranceCoverage;
    System.out.println(tot);

    }
}
