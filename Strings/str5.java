import java.util.Scanner;
public class str5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int valid=0,invalid=0;
        System.out.println("Email Validation Results:");
        for(int i=1;i<=n;i++){
            int index=0;
            int next=0;
            String str=sc.next();
            if(!str.startsWith("@")&& !str.endsWith("@")&& !str.startsWith(".") && !str.endsWith(".")){
                index=1;
            }
            if(str.indexOf('@')>0 && str.indexOf('.')>0){
                if(str.indexOf('@')<str.indexOf('.')){
                    next=1;
                }
            }

        if(index==1 && next==1){
            System.out.println(i+". "+str+" - Valid");
            valid++;
        }
        else{
            System.out.println(i+". "+str+" - Invalid");
            invalid++;
        }
        }
    System.out.println("\nTotal Valid: "+valid);
    System.out.println("Total Invalid: "+invalid);    

    }
}
