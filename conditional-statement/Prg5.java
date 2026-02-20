import java.util.Scanner;
public class Prg5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double gpa=sc.nextDouble();
        double income=sc.nextDouble();
        int score=sc.nextInt();
        String scholorship=sc.next();
        int eligible=0;
        String category="None";
        double award=0.0;
        if(gpa>=2.5){
            eligible=1;
            if(scholorship.equals("Merit")){
                if(gpa>=3.8 && score>=80){
                    category="Full";
                    award=25000.0;
                }
                else if(gpa>=3.5 && score>=70){
                    category="Partial";
                    award=15000.0;
                }
                else if(gpa>=3.0 && score>=60){
                    category="Minimal";
                    award=8000.0;
                }
            }
            else if(scholorship.equals("Need-Based")){
                if(income<=30000 && gpa>=3.5){
                    category="Full";
                    award=30000.0;
                }
                else if(income<=50000 && gpa>=3.0){
                    category="Partial";
                    award=18000.0;
                }
                else if(income<=70000 && gpa>=2.8){
                    category="Minimal";
                    award=10000.0;
                }
            }
            if(scholorship.equals("Sports")){
                if(gpa>=3.0 && score>=85){
                    category="Full";
                    award=22000.0;
                }
                else if(gpa>=2.8 && score>=75){
                    category="Partial";
                    award=20000.0;
                }
                else if(gpa>=2.5 && score>=65){
                    category="Minimal";
                    award=12000.0;
                }
            }    
        }
        else{
            eligible=0;
        }
        System.out.println("GPA: "+gpa);
        System.out.println("Family Income: $"+income);
        System.out.println("Extracurricular Score: "+score);
        System.out.println("Scholarship Type: "+scholorship);
        if(eligible==1)
        System.out.println("Eligibility: "+"Eligible");
        else{
            System.out.println("Eligibility: "+"Not Eligible");
        }
        System.out.println("Award Amount: $"+award);
        System.out.println("Award Category: "+category);

        }
    }

