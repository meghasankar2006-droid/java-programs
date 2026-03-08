import java.util.*;
public class Prg20 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int fact=1,sum=0;
    int temp=n;
    while(n>0){
        int rem=n%10;
        int i=1;
        while(i<=rem){
            fact=fact*i;
            i++;
        }
        sum=sum+fact;
        fact=1;
        n=n/10;
    }
    if(temp==sum){
        System.out.println(temp+" is a Strong Number");
    }
    else{
        System.out.println(temp+" is not a Strong Number");
    }
    }
}
