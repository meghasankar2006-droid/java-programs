import java.util.Scanner;
public class Prg8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rodsPerHour=sc.nextInt();
        int hoursWorked=sc.nextInt();
        int overtimeRods=sc.nextInt();
        int rejectedRods=sc.nextInt();
        int wrk=rodsPerHour*hoursWorked;
        int tot=(wrk+overtimeRods)-rejectedRods;
        System.out.println(tot);
    }
}

