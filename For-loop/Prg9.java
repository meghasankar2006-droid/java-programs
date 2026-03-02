import java.util.Scanner;
public class Prg9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cal=0;
        String intensity=" ";
        int Duration=0;
        int csum=0;
        for(int i=1;i<=n;i++){
            String etype=sc.next();
            int min=sc.nextInt();
            Duration=Duration+min;
            if(etype.equals("Running")){
                cal=10*min;
                intensity="High";
            }
            if(etype.equals("Swimming")){
                cal=12*min;
                intensity="High";
            }
            if(etype.equals("Cycling")){
                cal=8*min;
                intensity="Moderate";
            }
            if(etype.equals("Gym")){
                cal=7*min;
                intensity="Moderate";
            }
            if(etype.equals("Walking")){
                cal=4*min;
                intensity="Low";
            }
            csum=csum+cal;
            System.out.println("Session "+i+":"+etype);
            System.out.println("Duration: "+min+" minutes");
            System.out.println("Calories Burned: "+cal);
            System.out.println("Intensity: "+intensity);
            System.out.println("");
            
        }
        double avg=csum/n;
        System.out.println("Total Workouts: "+n);
        System.out.println("Total Duration: "+Duration);
        System.out.println("Total Calories Burned: "+csum);
        System.out.println("Average Calories per Session: "+avg);
        if(csum<300){
            System.out.println("Fitness Level: Beginner");
        }
        else if(csum<1000){
            System.out.println("Fitness Level: Intermediate");
        }
        else if(csum>1000){
            System.out.println("Fitness Level: Advanced");
        } 
        sc.close();   
    }
}
