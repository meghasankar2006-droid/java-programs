import java.util.Scanner;
public class Prg2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0;
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            String stuname=sc.next();
            int score=sc.nextInt();
            sum=sum+score;
            String grade=" ";
            if(max<score){
                max=score;
            }
            if(score>=85 && score<=100){
                grade="A";
            }
            else if(score>=70){
                grade="B";
            }
            else if(score>=60){
                grade="C";
            }
            else if(score>50){
                grade="D";
            }
            else if(score<50){
                grade="F";
            }
            String result=" ";
        if(score>=60){
            result="Pass";
            count++;
        }
        else{
            result="Fail";
        }
        
        System.out.println("Student: "+stuname);
        System.out.println("Score: "+score);
        System.out.println("Letter Grade: "+grade);
        System.err.println("Status: "+result);
    }
    double avg=sum/n;
    System.out.println("Total Students: "+n);
    System.out.println("Class Average: "+avg);
    System.out.println("Highest Score: "+max);
    System.out.println("Students Passed: "+count);
    System.out.println("Students Failed: "+(n-count));
    sc.close();
    }
    
}
