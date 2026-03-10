import java.util.Scanner;
public class prg3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String type=sc.next();
        if(type.equals("star")){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        }
        if(type.equals("number")){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                {
                    System.out.print(j);
                }
            }
            System.out.println("");
        }
        }
    }
}
