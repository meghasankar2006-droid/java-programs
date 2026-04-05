
import java.util.Scanner;
public class problem1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String [] str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                int len=str[j].length();
                int len1=str[j+1].length();
                if(len>len1){
                    String temp=str[j];
                    str[j]=str[j+1];
                    str[j+1]=temp;
                }
                }       
            }
        
        for(int i=0;i<n;i++){
            System.out.println(str[i]);
        }
    }
    }
