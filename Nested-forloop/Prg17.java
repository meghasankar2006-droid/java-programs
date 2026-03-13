import java.util.Scanner;
public class Prg17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int width=sc.nextInt();
        for(int i=0;i<h;i++){
            for(int j=0;j<width;j++){
                if(j==0 || j==width-1||i==0||i==h-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
