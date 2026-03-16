import java.util.Scanner;
public class arr10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        double sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
            sum=sum+arr[i];
            if(arr[i]>200){
                count++;
            }
        }
        double avg=sum/n;
        double per=((n-count)*100.0)/n;
        System.out.println("Total Servers:"+n);
        System.out.println("Fastest Response: "+min+"ms");
        System.out.println("Slowest Response: "+max+"ms");
        System.out.printf("Average Response: %.2f ms \n ",avg);
        System.out.println("Slow Servers (>200ms):"+count);
        System.out.printf("Performance Score: %.2f %%",per);
    }
}
