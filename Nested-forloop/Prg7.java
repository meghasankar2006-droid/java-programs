import java.util.Scanner;
public class Prg7 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mid=n/2;
        for(int i=0;i<=mid;i++){
            for(int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        int s=n-mid;
        for(int i=s;i>=0;i--){
            for(int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
