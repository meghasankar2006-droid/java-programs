import java.util.Scanner;
public class arr3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        int count=0;
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]<50){
                count++;
            }
        }
        int pass=n-count;
        double per=(pass*100.0)/n;
        System.out.println("Total Students: "+n);
        System.out.println("Highest Score: "+max);
        System.out.println("Lowest Score: "+min);
        System.out.println("Failed Students: "+count);
        System.out.printf("Pass Percentage: %.2f%%",per);

    }
}
