import java.util.Scanner;
public class arr8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        double sum=0;
        int count=0;
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            sum=sum+arr[i];
            if(arr[i]>60){
                count++;
            }

        }
        double avg=sum/n;
        double per=((n-count)*100.0)/n;
        System.out.println("Total Patients: "+n);
        System.out.println("Longest Wait Time: "+max+" minutes");
        System.out.printf("Average Wait Time: %.2f minutes\n",avg);
        System.out.println("Patients Waiting >60 min: "+count);
        System.out.println("Service Level: "+per+"%");
    }
}
