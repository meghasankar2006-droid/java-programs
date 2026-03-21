import java.util.Scanner;

public class arr9 {
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
        System.out.println("\nElevation Map:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            } 
            System.out.println(" ");   
        }
        System.out.println(" ");
        int max=arr[0][0];
        int min=arr[0][0];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int val=arr[i][j];
                if(val>max){
                    max=val;
                }
                if(val<min){
                    min=val;
                }
            }
        }
        int range=max-min;
        System.out.println("Highest Point: "+max+" m");
        System.out.println("Lowest Point: "+min+" m");
        System.out.println("Elevation Range: "+range+" m");
    }
}