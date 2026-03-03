import java.util.Scanner;
public class Prg13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            String dname=sc.next();
            int age=sc.nextInt();
            double weight=sc.nextDouble();
            double hemo=sc.nextDouble();
            System.out.println("Donor: "+dname);
            System.out.println("Age: "+age+" Years");
            System.out.println("Weight:"+weight+" Kg");
            System.out.println("Hemoglobin: "+hemo+" g/dL");
            String status="Not eligible";
            if((age>=18 && age<=65) && weight>=50 && hemo>=12.5){
                status="Eligible";
                System.out.println("Status: "+status);
                count++;
            }
            else{
                status="Not Eligible";
                System.out.println("Status: "+status);
                System.out.println("Reason: Hemoglobin below 12.5 g/dL");
            }
            System.out.println("");
        }
        double rate=(count/n)*100;
        System.out.println("Total Donors: "+n);
        System.out.println("Eligible Donors: "+count);
        System.out.println("Rejected Donors:"+(n-count));
        System.out.println("Eligibility Rate: "+rate+"%");
        sc.close();
    }
}
