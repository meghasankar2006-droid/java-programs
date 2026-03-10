import java.util.Scanner;
public class Prg5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int days=sc.nextInt();
        int sday=sc.nextInt();
        int cells=(sday-1)+days;
        int rows=cells/7;
        int count=1;
        int date=1;
        System.out.println("Calendar Grid:");
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=7;j++){
                if(count>=sday && count<=days){
                    System.err.print(date+"  ");
                    date++;
                }
                count++;
            }
            System.out.println(" ");
        }
        
    }
}
