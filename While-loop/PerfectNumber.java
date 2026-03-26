import java.util.Scanner;
public class Prg17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=num/2){
            if(num%i==0){
                sum=sum+i;
            }
            i++;
        }
        if(num==sum){
            System.out.println(num+" is a perfect number");
        }
        else{
            System.out.println(num+" is not a perfect number");
        }
        
    }
}
