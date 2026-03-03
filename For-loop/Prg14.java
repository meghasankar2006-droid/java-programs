import java.util.Scanner;
public class Prg14 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count=0;
    double sum=0.0;

    for(int i=1;i<=n;i++){
        String btype=sc.next();
        int days=sc.nextInt();
        if(days>0){
            count++;
        }
        double dfine=0.0;
        if(btype.equals("Regular")){
            dfine=0.50;
        }
        if(btype.equals("Reference")){
            dfine=1.00;
        }
        if(btype.equals("Magazine")){
            dfine=0.25;
        }
        double cfine=days*dfine;
        double afine=0.0;
        System.out.println("Book "+i+": "+btype);
        System.out.println("Days Late: "+days);
        System.out.println("Daily Fine: $"+dfine);
        System.out.println("Calculated Fine: $"+cfine);

        if(btype.equals("Regular")){
            afine=10.0;
        }
        if(btype.equals("Reference")){
            afine=20.0;
        }
        if(btype.equals("Magazine")){
            afine=5.0;
        }
        if(cfine>=afine){
            sum=sum+afine;
            System.out.println("Actual Fine: $"+afine);
            System.out.println("Cap Applied: Yes");
        }
        else{
            sum=sum+cfine;
            System.out.println("Actual Fine: $"+cfine);
            System.out.println("Cap Applied: No");
        }
        System.out.println("");
    }
    double avg=sum/n;
    System.out.println("Total Books:"+n);
    System.out.println("Total Fines Collected: $"+sum);
    System.out.println("Books Overdue: "+count);
    System.out.printf("Average Fine: $ %.2f \n",avg);
    sc.close();
   } 
}
