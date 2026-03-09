import java.util.Scanner;
public class Prg23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        int i=0;
        while(i<str.length()){
            if((str.charAt(i)>='a'&& str.charAt(i)<='z')||(str.charAt(i)>='A'&& str.charAt(i)<='Z')){
                if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'||str.charAt(i)=='E'){
                    count++;
                }
            }
            i++;
        }
        System.out.println("Vowel count:"+count);

    }
}
