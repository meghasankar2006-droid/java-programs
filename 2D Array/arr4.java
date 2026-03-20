import java.util.Scanner;

public class arr4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row =sc.nextInt();
        int col=sc.nextInt();
        int [][]arr =new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Product-wise Total Sales:");
        int max=0;
        int index=0;
        for(int i=0;i<row;i++){
            int sum=0;
            for(int j=0;j<col;j++){
                sum=sum+arr[i][j];
            }
            if(sum>max){
                max=sum;
                index=i+1;
            }
            System.out.printf("Product %d : %d \n",i+1,sum);
        }
        System.out.printf("Best-Selling Product: Product %d with %d units",index,max);

    }
}
