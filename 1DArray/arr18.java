import java.util.Scanner;
public class arr18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        double sum=0;
        int max=0,index=0;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
            if(arr[i]>max){
                max=arr[i];
                index=i+1;
            }
        }
        double avg=sum/n;
        double th=(0.5*avg);
        int count=0;

        for(int i=0;i<n;i++){

            if(arr[i]<th){
                count++;
            }  
        }
        System.out.println("Total Products: "+n);
        System.out.println("Total Units Sold: "+sum);
        System.out.println("Average Monthly Sales: "+avg);
        System.out.println("Best Seller: Product "+index+" ("+max+" units)");
        System.out.println("Slow-Moving Products: "+count);
        System.out.printf("Turnover Threshold: %.2f units \n",th);
        System.out.print("Clearance Candidates: [");

        for(int i=0;i<n;i++){
            if(arr[i]<th){
                System.out.print(i+" ");
            }
        }
        System.out.println("]");

    }
}
