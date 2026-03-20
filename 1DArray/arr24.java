import java.util.Scanner;

public class arr24 {
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
        double bargain=(0.7*avg);
        double premium=1.5*avg;
        double max=arr[0];
        double min=arr[0];
        int f=0;
        int l=0;
        int count=0,count1=0;


        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
                f=i+1;
            }
            if(min>arr[i]){
                min=arr[i];
                l=i+1;
            }
            if(arr[i]<bargain){
                count++;
        }
            if(arr[i]>premium){
                count1++;
            }
    }
    System.out.println(" Total Properties: "+n);
    System.out.println("Portfolio Value: $"+sum);
    System.out.printf("Average Property Value: $ %.2f \n",avg);
    System.out.printf("Most Valuable: $%.2f (property %d)\n",max,f);
    System.out.printf("least Valuable: $%.2f (property %d)\n",min,l);
     System.out.println(" Bargain Properties (<70% avg): "+count);
     System.out.println("Premium Properties (>150% avg):"+count1);
}
}
