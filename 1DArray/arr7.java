import java.util.Scanner;
public class arr7 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0,k=0;
        int [] dup=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                dup[k]=i+1;
                k++;
                count++;

            }
        }
    double per=((n-count)*100.0)/n;
        System.out.println("Production Lines:"+n);
        System.out.println("Acceptable Threshold: "+max);
        System.out.println("Lines Exceeding Threshold: "+count);
        System.out.print("Critical Lines: [");
        for(int i=0;i<k;i++){
            System.out.print(" "+dup[i]+" ");
        }
        System.out.println("]");
        System.out.printf("Compliance Rate: %.2f%%",per);

    }
}
