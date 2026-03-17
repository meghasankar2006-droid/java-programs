import java.util.Scanner;
public class arr19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        int sum=0;
        int max=0;
        int index=0;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
            if(arr[i]>max){
                max=arr[i];
                index=i+1;
            }
        }
        int target=sc.nextInt();
        double avg=sum/n;
        int count=0,val=0;

        for(int i=0;i<n;i++){
            if(arr[i]<target){
                count++;
            }
            else{
                val++;
            }
        }
        double per=(val*100.00)/n;

    System.out.println("Days Tracked: "+n);
    System.out.println("Total Calories Burned: "+sum);
    System.out.printf("Average Daily Burn: %.2f \n ",avg);
    System.out.println("Peak Burn Day: Day "+index+"("+max+" calories)");
    System.out.println("Days Below Target: "+count);
    System.out.printf("Goal Achievement: %.2f %% ",per);



    }
}
