import java.util.Scanner;
public class prg24 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int n1=a,n2=b;
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        System.out.println("HCF of "+n1+" and "+n2+" = "+a);
    }
}