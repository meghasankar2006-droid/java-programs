import java.util.Scanner;
public class arr17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]arr=new int[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                   arr[i][j]=sc.nextInt(); 
                
                if(arr[i][j]==' '){
                    break;
                }
            }
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){

            }
        }
        sc.close();
    }
}
