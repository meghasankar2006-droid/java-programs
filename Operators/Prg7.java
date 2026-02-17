import java.util.Scanner;
public class Prg7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cardval=sc.nextInt();
        int per=sc.nextInt();
        if(cardval>999 || per==1){
            System.out.println("Free Shipping");
        }
        else{
            System.out.println("Charges Applied");
        }
    }
}
