import java.util.Scanner;
public class Prg13 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int top=0;
        int right=n-1;
        int left=0;
        int bottom=n-1;
        int size=n*n;
        int num=1;
        int [][]arr=new int[n][n];
        while(num<=size){

            for(int i=top;i<=right;i++){
                arr[top][i]=num;
                num++;
            }
            for(int i=left+1;i<=bottom;i++){
                arr[i][bottom]=num;
                num++;
            }
            for(int i=right-1;i>=top;i--){
                arr[right][i]=num;
                num++;
            }
            for(int i=bottom-1;i>=left+1;i--){
                arr[i][left]=num;
                num++;
            }
            top++;
            left++;
            bottom--;
            right--;   
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
        }

    }

