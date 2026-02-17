import java.util.Scanner;
public class Prg6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int income=sc.nextInt();
        int per=sc.nextInt();
        if(income<200000 && per >=75){
            System.out.println("Scholorship Granted");
        }
        else{
            System.out.println("Not Granted");
        }
    }
}
