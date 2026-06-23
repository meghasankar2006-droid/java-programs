import java.util.ArrayList;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       ArrayList<Integer> List=new ArrayList<>();
       List.add(5);
       List.add(6);
       List.add(10);
       List.add(60);
       List.add(30);
       List.add(40);
       int s=List.size();
       
       int start =0;
       int end=List.size()-1;
       while(start<end){
           int temp=List.get(start);
           List.set(start,List.get(end));
           List.set(end,temp);
           start++;
           end--;
       }
       System.out.println(List);
       
       
