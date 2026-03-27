import java.util.Scanner;
public class arr18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]arr=new int[n][];
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            arr[i]=new int[val];
            for(int j=0;j<val;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("\nHotel Status:\n");
        for(int i=0;i<n;i++){
            System.out.print("Floor "+(i+1)+": ");
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
         System.out.println(" ");
        }
        System.out.println("\nOccupancy Report:\n");
        int max=0;
        int index=0;
        for(int i=0;i<n;i++){
            int count=0;
            System.out.print("Floor "+(i+1)+": ");
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
            if(count>max){
                max=count;
                index=i+1;
            }
         System.out.println(count+" occupied");
        }
    System.out.println("\nBusiest Floor: Floor "+index+" ("+max+" rooms occupied)");
        sc.close();
    }
}
