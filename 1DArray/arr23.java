
    import java.util.Scanner;

public class arr23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        int sum=0;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        double avg=sum/n;
        double th=(0.9*avg);
        int max=arr[0];
        int index=0;
        int count=0;

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i+1;
            }
            if(arr[i]<th){
                count++;
            }
        }
        System.out.println("Production Lines:  "+n);
        System.out.println(" Total Output: "+sum+" Units");
        System.out.println("Average Output: "+avg+" units/hours");
        System.out.println("Top Producer: Line "+index+"("+max+" Units)");
        System.out.println("Underperforming Lines: "+count);
        System.out.printf("Performance Threshold: %.2f units \n ",th);
        System.out.print("Priority Lines: [");

        for(int i=0;i<n;i++){
            if(arr[i]<th)
            System.err.print(i+1+" ");
        }
        System.out.println("]");



    }
}


