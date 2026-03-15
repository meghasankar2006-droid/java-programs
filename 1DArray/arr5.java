import java.util.Scanner;
public class arr5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double []arr=new double[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
        }
        double max=arr[0];
        double min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        double diff=max-min;
        double save=(diff*100.0)/max;
        System.out.printf("Number of Sellers: %d\n",n);
        System.out.printf("Lowest Price: $%.2f\n",min);
        System.out.printf("Highest Price: $%.2f\n",max);
        System.out.printf("Price Difference: $%.2f\n",diff);
        System.out.printf("Savings: %.2f%%\n",save);

    }
}
