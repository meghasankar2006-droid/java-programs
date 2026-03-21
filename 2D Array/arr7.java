import java.util.Scanner;

public class arr7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int [][] arr=new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        int max=0;
        int maxi=0;
        int maxj=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sum=sum+arr[i][j];
            
                int val=arr[i][j];
                if(max<val){
                    max=val;
                    maxi=i;
                    maxj=j;
                }
            }
        }
        double tot=row*col;
        double avg=(sum/tot)*100.0;
        System.out.println("Total Inventory: "+sum);
        System.out.printf("Max Stock Zone: Row %d,Col %d (%d units)\n",maxi,maxj,max);
        System.out.printf("Average Stock per Zone: %.0f",avg);
    }
}
