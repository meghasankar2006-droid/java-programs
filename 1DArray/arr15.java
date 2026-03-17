import java.util.Scanner;
public class arr15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        double sum=0;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        double avg=sum/n;

        int max=arr[0];
        int min=arr[0];
        int count=0;

        for(int i=0;i<n;i++){

            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }

            if(arr[i]>300){
                count++;
            }
        }

        double target=((n-count)*100.0)/n;

       
         System.out.println("Total Calls: "+n);
          System.out.printf("Average Handling Time: %.2f seconds \n",avg);
           System.out.println("Shortest Call: "+min+" seconds");
         System.out.println("Longest Call: "+max+" seconds");
          System.out.println("Calls Exceeding Target (300s): "+count);
           System.out.printf("Target Compliance: %.2f%% =",target);
    }
}
