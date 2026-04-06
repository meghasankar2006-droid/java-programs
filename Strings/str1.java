import java.util.Scanner;

public class str1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        String[]str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        int count1=0;
        int count2=0;

        for(int i=0;i<n;i++){
            int len=str[i].length();
            String word=str[i];
            for(int j=0;j<len;j++){
                if(word.charAt(0)!='@'|| word.charAt(len-1)!='@'||word.charAt(0)=='.'||word.charAt(len-1)=='.'){
                    count1++;
                }
                if(word.charAt(j)>='1');
            }
        }
    }
}
