import java.util.Scanner;

public class arr5 {
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
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        int max=arr[0][0];
        int min=arr[0][0];
        int maxj=0,maxi=0;
        int minj=0,mini=0;
        double sum=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int val=arr[i][j];
                if(val>max){
                    max=val;
                    maxi=i;
                    maxj=j;
                }
                if(val<min){
                    min=val;
                    minj=j;
                    mini=i;
                }
                sum=sum+val;
            }
        }
        double n=row*col;
        double avg=(sum/n)*100.0;
        System.out.printf("Maximum Temperature: %d°C at position (%d, %d)\n",max,maxi,maxj);
        System.out.printf("Minimum Temperature: %d°C at position (%d, %d)\n",min,mini,minj);
        System.out.printf("Average Temperature: %.0f°C",avg);

    }
}
