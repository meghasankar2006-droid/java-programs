import java.util.Scanner;
public class arr12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double []arr=new double[n];

        double sum=0.0;
    

        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
            sum=sum+arr[i];
        }

        double limit=sc.nextDouble();
        double max=arr[0];
        int hour=0;

        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
                hour=i+1;
            }
        }
        double avg=sum/n;

        System.out.println("Hours Monitored:"+n);
        System.out.println("Total Daily Consumption: "+sum+" kWh");
        System.out.println("Peak Hour: Hour "+hour+"("+max+" kWh)");
        System.out.printf("Average Hourly: %.2f kWh \n ",avg);
        System.out.println("Daily Limit: "+limit+" kWh");

        if(sum<limit){
            System.out.println("Status: Within Limit");
        }
        else{
            System.out.printf("Exceeded by %.2f kWh",(sum-limit));
        }



    }
}
