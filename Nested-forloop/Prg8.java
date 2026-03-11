import java.util.Scanner;
public class Prg8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int days=sc.nextInt();
        int sum=0;
        double avg=0.0;
        int count=0;
        System.out.print("Student");
        for(int i=1;i<=days;i++){
            System.out.print("Day"+i+" ");
        }
        System.out.println("Attendance%");
        for(int i=1;i<=n;i++){
            String stuname=sc.next();
            System.out.print(stuname+" ");
            for(int j=1;j<=days;j++){
                char day=sc.next().charAt(0);
                System.out.print(day+" ");
                if(day=='P'|| day=='p'){
                    sum=sum+1;
                } 
                avg=(sum*100.0)/days;  
            }
            System.out.printf("%.2f%%",avg);
            if(avg==100.0){
                count++;
            }
            System.out.println(" ");
            avg=0.0;
            sum=0;
        }
        System.err.println("Perfect Attendance:"+count+" Students");
    }
}
