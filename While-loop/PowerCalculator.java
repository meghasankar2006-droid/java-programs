import java.util.Scanner;
public class Prg13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int pow=sc.nextInt();
        int dup=pow;
        int val=1;
        while(pow>0){
            val=val*base;
        pow--;
        }
        System.out.println(base+"^"+dup+" = "+val);
    }
}
