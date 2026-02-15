import java.util.Scanner;
public class Prg6 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int distance=sc.nextInt();
        int mileage=sc.nextInt();
        int fuel=sc.nextInt();
        int toll=sc.nextInt();
        int litre=distance/mileage;
        int fuelamt=litre*fuel;
        int tollcharge=fuelamt+toll;
        System.out.println(tollcharge);

    }
}