import java.util.Scanner;

public class arr25 {
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
        double th=(2.0*avg);
        int max=arr[0];
        int min=arr[0];
        int index=0,mindex=0;
        int count=0;

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i+1;
            }
             if(arr[i]<min){
                min=arr[i];
                mindex=i+1;
             }
            if(arr[i]>th){
                count++;
            }
        }
        System.out.println("Security Events Analyzed: "+n);
        System.out.println("Average Risk Score:  "+avg+" units/hours");
        System.out.println("Highest Risk Event: "+max+"(Events "+index+")");
        System.out.println("Lowest Risk Event:"+min+"(Events "+mindex+")");
        System.out.println("Critical Threats (>200% avg): "+count);
        System.out.printf("Thread Threshold: %.2f units \n ",th);
        System.out.print("Alert Events : [");

        for(int i=0;i<n;i++){
            if(arr[i]>th)
            System.err.print(i+1+" ");
        }
        System.out.println("]");
                
    }
}
