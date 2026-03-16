import java.util.Scanner;
public class arr9 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double []arr=new double[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
        }
        double max=arr[0];
        double min=arr[0];
        double sum=0.0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            sum=sum+arr[i];
        }

        double avg=sum/n;

        System.out.println("Total Stores: $"+n);
        System.out.println("Highest Sales: $"+max);
        System.out.println("Lowest Sales: $"+min);
        System.out.println("Total Sales: $"+sum);
        System.out.println("Total Sales: $"+avg);
        
    }
}
