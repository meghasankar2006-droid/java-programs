import java.util.Scanner;

public class arr2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int n=sc.nextInt();
        int [] []arr=new int [row][col];

        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            arr[a][b]=1;
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==1){
                    System.out.print("B ");
                }
                else{
                    System.out.print("A ");
                } 
            }
            System.out.println("");
        }
        int tot=row*col;
        int available=tot-n;
        double per=((n*100.0)/tot)*100;
        System.out.println("Total Seats: "+tot);
        System.out.println("Booked Seats: "+n);
        System.out.println("Available Seats:"+available);
        System.out.printf("Occupancy Rate: %.0f%% ",per);

    }
}
