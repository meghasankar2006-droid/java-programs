import java.util.Scanner;
public class prg4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int lmt=sc.nextInt();
        int amt=sc.nextInt();
        int card=sc.nextInt();
        if(amt<=lmt && card==0){
            System.out.println("Approved");
        }
        else{
            System.out.println("Declined");
        }
    }
}
