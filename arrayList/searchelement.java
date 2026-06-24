import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            arr.add(num);
        }
        int key =sc.nextInt();
        int found=0;
        for(int num:arr){
            if(num==key){
                found=1;
                System.out.println("Found");
                break;
            }
        }
        if(found==0){
            System.out.println("not found");
        }
    }
}
