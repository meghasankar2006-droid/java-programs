import java.util.ArrayList;
import java.util.*;
class Main {
    public static void main(String[] args) {
        ArrayList<Integer> List=new ArrayList<>();
        List.add(20);
        List.add(20);
        List.add(201);
        List.add(200);
        int max=0;
        for(int num:List){
            if(num>max){
                max=num;
            }
        }
        System.out.println(max);
    }
}
