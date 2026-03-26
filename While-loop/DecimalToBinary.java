import java.util.Scanner;
public class Prg19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int count=1;
        while(n>0){
            int d=n%2;
            n=n/2;
            rev=(rev*10)+d;
            count++;
        }
        int temp=rev;
        int count1=1;
        while(rev>0){
            int rem=rev%10;
            count1++;
            rev=rev/10;
        }
        if(count1<count){
            while(count1<count){
                temp=temp*10;
                count1++;
            }
            
        }
        System.out.println(temp);
    
    }
    

}
