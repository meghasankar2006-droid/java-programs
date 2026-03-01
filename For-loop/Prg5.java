import java.util.Scanner;
public class Prg5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double sum=0.0;
        double max=0.0;
        int peak=0;
        int count=0;
        for(int i=1;i<=n;i++){
            int day=sc.nextInt();
            int roccupied=sc.nextInt();
            int totalroom=sc.nextInt();
            double rate=(roccupied*100.0)/totalroom;
            System.out.println(rate);
            sum=sum+rate;

            if(max<rate){
                max=rate;
                peak=i;
                System.out.println(peak);

            }
            if(rate==100.0){
                count++;
            }
            String status=" ";
            if(rate<60){
                status="Low";
            }
            else if(rate>=60 && rate<=79){
                status="Moderate";
            }
            else if(rate>=80 && rate<=99){
                status="High";
            }
            else if(rate==100){
                status="Full";
            }
            
        System.out.println("Rooms Occupied: "+roccupied);
        System.out.println("Total Rooms: "+totalroom);
        System.out.println("Occupancy Rate: "+rate +"%");
        System.out.println("Status: "+status);
        System.out.println(" ");
        }
        double avg=sum/n;
        System.out.println("Total Days Analyzed: "+n);
        System.out.printf("Average Occupancy Rate: %.1f %% \n ",avg);
        System.out.println("Peak Occupancy Day: "+peak);
        System.out.println("Days at Full Capacity: "+count);
        sc.close();
    }
}
