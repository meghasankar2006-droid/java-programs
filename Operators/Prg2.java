import java.util.Scanner;
public class Prg2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int bal=sc.nextInt();
        int wamt=sc.nextInt();
        int lmt=sc.nextInt();
        if(wamt<=bal && wamt<=lmt){
            System.out.println("Approved");
        }
        else{
            System.out.println("Declined");
        }

    }
}
