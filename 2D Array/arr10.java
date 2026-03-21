import java.util.Scanner;

public class arr10 {
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
        System.out.println("Sales Matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("\nRepresentative Totals:");
        for(int i=0;i<row;i++){
            int sum=0;
            for(int j=0;j<col;j++){
                sum=sum+arr[i][j];
            }
            System.out.println("Rep "+(i+1)+": "+sum);
        }
        System.out.println("\nTerritory Totals:");
        for(int i=0;i<col;i++){
            int sum=0;
            for(int j=0;j<row;j++){
                sum=sum+arr[j][i];
            }
            System.out.println("Territory "+(i+1)+": "+sum);
        }
    }
}
