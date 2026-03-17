import java.util.Scanner;
public class arr16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        int sum=0;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        int avg=sum/n;

        int high=(150/100)*avg;
        int max=arr[0];
        int index=0;
        int count=0,k=0;
        int []a=new int[n];


        for(int i=0;i<n;i++){
            
            if(arr[i]>max){
                max=arr[i];
                index=i+1;
            }
            if(arr[i]>high){
                count++;
                a[k]=i+1;
                k++;
            }

        }
        System.out.println("Trading Days Analyzed:"+n);
        System.out.println("Total Volume: "+sum);
        System.out.println("Average Daily Volume: "+avg);
        System.out.println("Peak Volume Day: Day "+index+" ("+max+")");
        System.out.println("High Volume Days (>150% avg):"+count);
        System.out.print("Breakout Signal Days: [");
        for(int i=0;i<k;i++){
            System.out.print(" "+a[i]+" ");
        }
        System.out.println("]");
    }
}
