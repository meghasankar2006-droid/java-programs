import java.util.Scanner;

public class Prg1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String pass=sc.next();
        int i=3;
        while(i>0){
            System.out.println("Enter password:");
            String test=sc.next();
            if(i==3){
                if(test.equals(pass)){
                    System.out.println("Access granted");
                    break;
                }
                else{
                    System.out.println("Incorrect! Attempts remaining: 2");
                }
            }
            if(i==2){
                if(test.equals(pass)){
                    System.out.println("Access granted!");
                    break;
                }
                else{
                    System.out.println("Incorrect! Attempts remaining: 1");
                }
            }
            if(i==1){
                if(test.equals(pass)){
                    System.out.println("Access granted!");
                    break;
                }
                else{
                    System.out.println("Account locked!");
                }
            }
        i--;    
        }

    }
}
