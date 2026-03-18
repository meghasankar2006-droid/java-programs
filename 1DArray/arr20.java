import java.util.Scanner;

public class arr20 {
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
        int min=arr[0];
        int min_index=0;
        int max_index=0;
        int count=0;

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                max_index=i+1;
            }
            if(arr[i]<min){
                min=arr[i];
                min_index=i+1;
            }
            if(arr[i]<60){
                count++;
            }

        }
        double per=((n-count)*100.0)/n;

        System.out.println("Total Students:"+n);
        System.out.printf("Average Completion: %.2f %% \n",avg);
        System.out.println("Highest Completion: "+max +"% (student "+max_index+")");
        System.out.println("Lowest Completion: "+min +"% (student "+min_index+")");
        System.out.println("At-Risk Students (<60%): "+count);
        System.out.println("Success Rate: "+per+" %");
    
    }
}
