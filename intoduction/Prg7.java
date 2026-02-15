import java.util.Scanner;
public class Prg7 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int wrk=sc.nextInt();
        int wages=sc.nextInt();
        int ot=sc.nextInt();
        int crg=sc.nextInt();
        int salary=wrk*wages;
        int bonus=salary+ot;
        int tot=bonus-crg;
        System.out.println(tot);
    }
}
