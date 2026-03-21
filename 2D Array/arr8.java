import java.util.Scanner;

public class arr8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int target=sc.nextInt();
        int [][]arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }    
        }
        System.out.println("\n Adjusted Image:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int val=arr[i][j]+target;
                if(val<=255){
                    System.out.print(val+" ");
                }
                else if(val<0){
                    val=0;
                    System.out.print(val+" ");
                }
                else{
                    val=255;
                    System.out.print(val+" ");
                }
            }
            System.out.println(" ");
        }
    }
}
