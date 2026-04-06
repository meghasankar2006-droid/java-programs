import java.util.Scanner;
public class str4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String str=sc.next().toLowerCase();
            int len=str.length();
            int left=0;
            int right=len-1;
            int palindrome=0;
            while(left<right){
                if(str.charAt(left)!=str.charAt(right)){
                    palindrome=1;
                    break;
                }
                left++;
                right--;
            }
                if(palindrome==0){
                    System.out.println(i+"."+str+" - palindrome");
                }
                else{
                    System.out.println(i+"."+str+" - Not palindrome");
                }
            
        }
    }
}
