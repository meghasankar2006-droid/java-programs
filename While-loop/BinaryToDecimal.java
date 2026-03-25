import java.util.Scanner;
public class Prg16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int binary=sc.nextInt();
        int sum=0;
        int count=0;
        while(binary>0){
            int d=binary%10;
            int pow=1;
            int i=0;
            while(i<count){
                pow=pow*2;
            i++;
            }
            sum=sum+(d*pow);
            binary=binary/10;
            count++;
        
        }
        System.out.println(sum);

    }
}
