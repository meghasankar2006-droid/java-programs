import java.util.Scanner;

public class arr23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
        int eq=0,k=0,count=0,sum=0;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=0;j<n;j++){
                sum=sum+arr[i][j];
            }
            if(sum==eq || k==0){
                count++;
                k++;
                eq=sum;
            }
        }
        if(count==n){
            System.out.println("\nResult: Magic Square");
            System.out.println("(Constant: "+eq+")");
        }
        else{
            System.out.println("\nResult: Not a Magic Square");
            System.out.println("(Constant: "+eq+")");
        }
        sc.close();
    }
}
