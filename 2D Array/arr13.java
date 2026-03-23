import java.util.Scanner;

public class arr13 {
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
        int count=0;
        int index=0;
        int []temp=new int[col*row];
        for(int i=0;i<row;i++){
            int zero=0;
            for(int j=0;j<col;j++){
                if(arr[i][j]==1){
                    count++;
                }
                if(arr[i][j]==0){
                    zero++;
                }
            }

            if(zero==col){
                temp[index]=i;
                index++;
            }
            
        }
        double tot=col*row;
        double per=(count/tot)*100.0;
        System.out.println("Total Occupied: "+count);
        System.out.printf("Occupancy Rate: %.2f%% \n",per);
        System.out.print("Empty Rows: [ ");
        for(int i=0;i<index;i++){
            System.out.print(temp[i]+" ");
        }
        System.out.println("]");
    }
}
