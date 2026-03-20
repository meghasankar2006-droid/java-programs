import java.util.Scanner;

public class arr1{
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
    
        for(int i=0;i<row;i++){
            double sum=0;
            for(int j=0;j<col;j++){
                sum=sum+arr[i][j];    
            }
            double avg=sum/col;
            double ans=avg*100;
            System.out.printf("Student %d : %.0f \n",i,ans);
        }
        System.err.println(" ");
        System.out.println("Subject Averages:");
        for(int i=0;i<col;i++){
            double sum=0;
            for(int j=0;j<row;j++){
                sum=sum+arr[j][i];    
            }
            double avg=sum/row;
            double ans=avg*100;
            System.out.printf("Subject %d : %.0f \n",i,ans);
        }

    }
}