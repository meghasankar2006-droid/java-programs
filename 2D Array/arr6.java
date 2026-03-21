import java.util.Scanner;

public class arr6 {
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
        for(int j=0;j<col;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println("");
    }
    System.out.println("Total Traffic Per Lane: ");
    for(int i=0;i<row;i++){
        int sum=0;
        for(int j=0;j<col;j++){
            sum=sum+arr[i][j];
        }
        System.out.println("Lane "+i+": "+sum);
    }
    int max=0;
    int index=0;
    for(int i=0;i<col;i++){
        int sum=0;
        for(int j=0;j<row;j++){
            sum=sum+arr[j][i];
        }
        if(max<sum){
            max=sum;
            index=i+1;
        }
    }
    System.out.println("Busiest Hour: Hours "+index+" with "+max+" vehicles");
   }
    
}
