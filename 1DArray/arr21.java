import java.util.Scanner;
public class arr21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double []arr=new double[n];
        double sum=0.0;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
            sum=sum+arr[i];

        }
        double avg=sum/n;
        double th=(0.8*avg);
        double max=arr[0];
        double min=arr[0];
        int f=0;
        int l=0;
        int count=0;


        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
                f=i+1;
            }
            if(min>arr[i]){
                min=arr[i];
                l=i+1;
            }
            if(arr[i]<th){
                count++;
        }
    }

            System.out.println("Fleet Size: "+n);
            System.out.printf("Average Fuel Efficiency:  %.2f \n",avg);
            System.out.printf("Most Efficient: %.2f MPG (vehicle %d ) \n",max,f);

            System.out.printf("Least Efficient: %.2f MPG (vehicle %d ) \n",min,l);
            
            System.out.println(" Underperforming Vehicles:  "+count);
            System.out.printf("Underperforming Vehicles: %.2f MPG \n",th);
            System.out.print("Maintenance Priority: [");
            int c=1;
            for(int i=0;i<n;i++){
                if(arr[i]<th){
                System.out.println(i+1);
                
            }    
        }
            System.out.println("]");

    }
}


