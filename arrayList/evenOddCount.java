import java.util.ArrayList;
import java.util.*;
public class Main{
    public static void main(String[]args){
        ArrayList<Integer> List=new ArrayList<>();
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(7);
        
        int ecount=0;
        int ocount=0;
        for(int num:List){
            if(num%2==0){
                ecount++;
            }
            else{
                ocount++;
            }
        }
        System.out.println("ecount="+ecount);
        System.out.println("ocount="+ocount);
        
    }
}
