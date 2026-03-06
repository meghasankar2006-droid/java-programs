import java.util.Scanner;
public class Prg9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        int i=2;
        while(i<num){
            if(num%i==0){
                count++;
            }
            i++;
        }
        if(count==0){
            System.out.println(num+" is prime.");
        }
        else{
            System.out.println(num+" is not prime.");
        }
    }
}
