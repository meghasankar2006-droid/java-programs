import java.util.Scanner;
public class arr17 {
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
        double max=arr[0];
        double min=arr[0];
        int count=0;


        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
            if(arr[i]<6.5 || arr[i]>8.5){
                count++;
        }
    }
            double per=((n-count)*100.0)/n;

            System.out.println("Total Samples: "+n);
            System.out.printf("Average pH: %.2f \n",avg);
            System.out.printf("Minimum pH: %.2f \n",min);
            System.out.printf("Maximum pH: %.2f\n ",max);
            System.out.println("Unsafe Samples:  "+count);
            System.out.printf("Safety Compliance: %.2f %%\n",per);
            System.out.print("Critical Alerts: [");
            int c=1;
            for(int i=0;i<n;i++){
                if(c<count){
                if(arr[i]<6.5 || arr[i]>8.5){
                System.out.print(i+1+", ");
                c++;
                }
            }
            else{
                if(arr[i]<6.5 || arr[i]>8.5){
                System.out.print(i+1);
                c++;
            }
            }
            
        }
            System.out.println("]");

    }
}


