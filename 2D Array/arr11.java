import java.util.Scanner;

public class arr11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][]arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]==1){
                    if(arr[i][j+1]==1){
                        System.out.println("1");
                    }
                    if(arr[i+1][j+1]==1){
                        System.out.println("2");
                    }
                    if(i<r && j<c)
                    if(arr[i][j-1]==1){
                        System.out.println("3");
                    }
                    if(arr[i+1][j]==1){
                        System.out.println("4");
                    }
                    if(arr[i-1][j-1]==1){
                        System.out.println("5");
                    }
                }
            }
        }

    }
}
