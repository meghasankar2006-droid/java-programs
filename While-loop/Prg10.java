import java.util.Scanner;
public class Prg10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Fibinacci sequence("+n+" terms)");
         int f=0;
         int l=1;

        while(n>0){
            System.out.print(f+" ");
            int c=f+l;
            f=l;
            l=c;
            n--;
        }
    }
}
