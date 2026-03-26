import java.util.Scanner;

public class arr16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]arr=new int[n][];

        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            int index=sc.nextInt();
            int len=val+1;
            arr[i]=new int[len];
            for(int j=0;j<arr[i].length;j++){
                if(j==index){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=0;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
        int num=sc.nextInt();
        int [][]find=new int[num][];
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            int index=sc.nextInt();
            if(arr[val][index]==1){
                System.out.printf("Checking Location (%d,%d): Treasure Found!\n",val,index);
            }
            else{
                System.out.printf("Checking Location (%d,%d): Treasure Not Found!\n",val,index);
            }
                
            
        }

    sc.close();
    }
}
