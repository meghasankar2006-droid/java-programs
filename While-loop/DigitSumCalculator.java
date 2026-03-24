import java.util.Scanner;
public class Prg8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Number: "+num);
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("Sum of digits: "+sum);
    }
}
