import java.util.Scanner;

public class arr20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("\nMatrix:\n");
        int [][]arr1=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr1[i][j]=arr[j][i];
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println("");
        }
        int Status=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]!=arr1[i][j]){
                    Status=1;
                    break;
                }
            }
        }
        if(Status==0){
            System.out.println("Status: Symmetric");
        }
        else{
            System.out.println("Status: Asymmetric");
        }
    sc.close();    
    }
}
