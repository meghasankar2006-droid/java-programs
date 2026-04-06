import java.util.Scanner;

public class str3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int len=str.length();
        int acount=0;
        System.out.println("Original: "+str);
        System.out.print("Compressed: ");
        for(int i=0;i<len;){
            int count=0;
            for(int j=i;j<len;j++){
                if(str.charAt(i)!=str.charAt(j)){
                    break;
                }
                else{
                    count++;
                }
            }
            System.out.print(str.charAt(i));
            System.out.print(count);
            i=i+count;

        }
        double ans=((len-acount)*100.0)/len;
        System.out.printf("\nCompression Ratio: %.2f%%",ans);
    
}
}
