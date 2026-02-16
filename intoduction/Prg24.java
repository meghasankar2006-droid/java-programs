import java.util.Scanner;
public class Prg24 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int registration=sc.nextInt();
        int broadcast=sc.nextInt();
        int sponser=sc.nextInt();
        int prize=sc.nextInt();
        int rent=sc.nextInt();
        int ads=sc.nextInt();
        int tot=registration+broadcast+sponser-prize-rent-ads;
        System.out.println(tot);

    }
}
