import java.util.Scanner;
public class Prg16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int input=sc.nextInt();
       boolean [][]arr=new boolean[input][c];
       for(int i=0;i<input;i++){
        int a=sc.nextInt();
        int b=sc.nextInt();
        arr[a][b]=true;
       }
       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(arr[i][j]){
                System.out.print("[O] ");
            }
            else{
                System.out.print("[ ] ");
            }
        }
        System.out.println(" ");
       }
       int tot=r*c;
       int occupied=input;
       int v=tot-occupied;
       double per=(occupied*100.0)/tot;
       System.out.println("Total Spots: "+tot);
       System.out.println("Occupied: "+occupied);
       System.out.println("Vacant: "+v);
       System.out.printf("Occupancy Rate: %.2f%%",per);

    }
}
