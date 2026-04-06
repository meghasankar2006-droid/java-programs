import java.util.Scanner;

public class str2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int caps=0,special=0,digit=0,small=0;
        for(int j=0;j<n;j++){
            caps=0;
            special=0;
            digit=0;
            small=0;
            String str=sc.next();
            int len=str.length();
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                    caps++;
                }
                if(str.charAt(i)=='@'||str.charAt(i)=='!'||str.charAt(i)=='$'||str.charAt(i)=='%'||str.charAt(i)=='^'||str.charAt(i)=='&'){
                    special++;
                }
                if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                    digit++;
                }
                if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                    small++;
                }
            }
            if(len>=8 && caps>=1 && special>=1 && digit>=1 && small>=1){
                System.out.println(str+" - strong");
            }
            else{
                System.out.println(str+" - Weak");
            }
        }
    }
}
