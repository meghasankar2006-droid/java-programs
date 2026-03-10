import java.util.Scanner;
public class Prg4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        double avg=0.0;
        System.out.println("Student Sub1 Sub2 Sub3 Sub4 Average");
        double sum=0.0;
        for(int i=1;i<=r;i++){
            String name=sc.next();
            System.out.print(name+" ");
            for(int j=1;j<=c;j++){
                int mark=sc.nextInt();
                System.out.print(mark+" ");
                sum=sum+mark;
                avg=sum/c;
            }
            System.err.printf("%.2f \n",avg);
            sum=0.0;
        }
    }
}
