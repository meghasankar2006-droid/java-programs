import java.util.Scanner;
public class Prg15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String product=sc.next();
            double rating=sc.nextDouble();
            System.out.print(product+" ");
            if(rating<2){
                System.out.print(rating+" ■");
            }
            else if(rating<3){
                System.out.print(rating+" ■ ■");
            }
            else if(rating<4){
                System.out.print(rating+" ■ ■ ■");
            }
            else if(rating<5){
                System.out.print(rating+" ■ ■ ■ ■");
            }
            else if(rating<6){
                System.out.print(rating+"■ ■ ■ ■ ■");
            }
        System.out.println("");   
        }

    }
}
