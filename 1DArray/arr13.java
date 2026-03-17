import java.util.Scanner;
public class arr13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        double sum=0;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        double avg=sum/n;
        int max=arr[0];
        int ontime=0;
        int count=0;

        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(arr[i]<=15){
                ontime++;
            }
            if(arr[i]>180){
                count++;
            }
        }
        double per=(ontime*100.0)/n;

        System.err.println("Total Flights: "+n);
        System.out.printf("Average Delay: %.2f minutes \n",avg);
        System.out.println("Maximum Delay: "+max+" minutes");
        System.out.println("On-Time Flights: "+ontime);
        System.out.println("Compensation Required: "+count);
        System.out.printf("On-Time Performance: %.2f%%",per);
        
    }
}
