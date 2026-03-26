import java.util.*;
public class Prg22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int temp=n1;
        int sum=0;
        while(n1<=n2){
            if(n1%2==0){
                sum=sum+n1;
            }
            n1++;
        }
        System.out.println("Sum of even numbers from "+temp+" to "+ 15 +": "+sum);
    }
}
