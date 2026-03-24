import java.util.Scanner;
public class Prg2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        int sum=0,count=0;
        while(i!=0){
            
            int val=sc.nextInt();
            System.out.print("Enter number (0 to stop):");
            System.out.println(val);
            sum=sum+val;
            count=count+1;
            i=val;
        }
        System.out.println("Total sum: "+sum);
        System.out.println("Count:"+(count-1));
    }
}
