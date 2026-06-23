import java.util.ArrayList;
import java.util.*;
class Main {
    public static void main(String[] args) {
        ArrayList<Integer> List=new ArrayList<>();
        List.add(20);
        List.add(20);
        List.add(20);
        List.add(200);
        int sum=0;
        for(int num:List){
            sum=sum+num;
        }
        System.out.println(sum);
    }
}
