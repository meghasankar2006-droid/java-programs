import java.util.Scanner;
public class Prg14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int n2=n;
        int count=0;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        int c=count;
        int pro=1;
        int sum=0;
        while(n2>0){
            int d=n2%10;
            while(count>0){
                pro=pro*d;
                count--;
            }
            sum=sum+pro;
            n2=n2/10;
            pro=1;
            count=c;

        }
        if(sum==n){
            System.out.println(n+" is an Armstrong number");
        }
        else{
            System.out.println(n+" is not an Armstrong number");
        }
    }
}
