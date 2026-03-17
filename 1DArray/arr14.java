import java.util.Scanner;
public class arr14 {
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
        double t=0.8*avg;
        double max=arr[0];
        int plot=0,count=0;

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                plot=i+1;
            }
            if(arr[i]<t){
                count++;
            }
        }

        System.out.println("Total Plots: "+n);
        System.out.printf("Total Harvest: %.2f tons \n",sum);
        System.out.printf("Average Yield: %.2f tons/acre \n",avg);
        System.out.printf("Highest Yield: %.2f tons/acre (plot %d ) \n",max,plot);
        System.out.println("Underperforming Plots: "+count);
        System.out.printf("Performance Threshold: %.2f tons/acre",t);
    }
}
