import java.util.Scanner;
public class Prg18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int days=sc.nextInt();
        int p=sc.nextInt();
        String [][] str=new String[days][p];    
        String [] week={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        for(int i=0;i<days;i++){
            for(int j=0;j<p;j++){
                str[i][j]=sc.next();
            }
        }
        System.out.println(" ");
        System.out.println("Day Period1 Period2 Period3 Period4 Period5 Period6");
        for(int i=0;i<days;i++){
            System.out.print(week[i]+" ");
            for(int j=0;j<p;j++){
                System.out.print(str[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
