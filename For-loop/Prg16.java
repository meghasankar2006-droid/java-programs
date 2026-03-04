import java.util.Scanner;
public class Prg16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pcount=0;
        int fcount=0;
        int max=0;
        double sum=0;
        for(int i=1;i<=n;i++){
            String stuname=sc.next();
            int crtans=sc.nextInt();
            int wrong=sc.nextInt();
            int unattempt=sc.nextInt();
            int score=(crtans*4)-(wrong*3)+(unattempt*0);
            if(score>max){
                max=score;
            }
            sum=sum+score;
            String result="";
            if(score>=32){
                result="Pass";
                pcount++;
            }
            else{
                result="Fail";
                fcount++;
            } 

            System.out.println("Student: "+stuname);
            System.out.println("Correct: "+crtans);
            System.out.println("Wrong:"+wrong);
            System.out.println("Unattempted:"+unattempt);
            System.out.println("Score: "+score);
            System.out.println("Result: "+result);
            System.out.println("");
        }
        double avg=sum/n;
        System.out.println("Total Students: "+n);
        System.out.println("Pass Count:"+pcount);
        System.out.println("Fail Count:"+fcount);
        System.out.println("Class Average:"+avg);
        System.out.println("Highest Score: "+max);
        sc.close();
    }
}
