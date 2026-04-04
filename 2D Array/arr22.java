import java.util.Scanner;

public class arr22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int [][]arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int top=0;
        int left=0;
        int right=col-1;
        int bottom=row-1;
        int []a=new int [row*col];
        int s=0;

        while(top<=bottom && left<=right){
                for(int k=left;k<=right;k++){
                    a[s]=arr[top][k];
                    s++;    
            }
            for(int j=top+1;j<=bottom;j++){
                a[s]=arr[j][bottom];
                s++;
            }
            for(int j=right-1;j>=left;j--){
                a[s]=arr[right][j];
                s++;
            }
            for(int j=bottom-1;j>=top;j--){
                a[s]=arr[j][top];
                s++;
            }
            top++;
            left++;
            right--;
            bottom--;
        }
        for(int i=0;i<s;i++){
            System.out.println(a[i]+" ");
        }
        sc.close();
    }
}
