import java.util.Scanner;
public class arr2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int min=sc.nextInt();
        int []arr=new int[n];
        int []a=new int[n];
        int k=0,count=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]<min){
                a[k]=i;
                count++;
                k++;
            }
        }
        System.out.println("Total Product: "+n);
        System.out.println("Minimum Threshold: "+min);
        System.out.println("Low Stock Products: "+count);
        System.out.print("product Indices: [ ");

        for(int i=0;i<k;i++){

            System.out.print(a[i]+" ");
        }
        System.out.println("]");
    }
}
