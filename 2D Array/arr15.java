import java.util.Scanner;

public class arr15 {
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
        int count=0;
        System.out.println("\nEmployee Contact Book: \n");
        for(int i=0;i<arr.length;i++){
            System.out.print("Dept "+(i+1)+": ");
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
                count++;
            }
            System.out.println(" ");
        }

    System.out.println("\nTotal Employees: "+count);
        
    }
}
