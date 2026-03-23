import java.util.Scanner;

public class arr12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int [][]arr=new int[4][7];
        for(int i=0;i<4;i++){
            for(int j=0;j<7;j++){
                arr[i][j]=sc.nextInt()*10;
            }
        }
        System.out.println("\nRainfall Days");
for(int i=0;i<4;i++){
            for(int j=0;j<7;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println(" ");
        }

        System.out.println("\nWeekly Totals:");
        int sum=0;
        int min=0,index=0;
        int count=0;
        for(int i=0;i<4;i++){
            int week=0;
            for(int j=0;j<7;j++){
                sum=sum+arr[i][j];
                week=week+arr[i][j];
            }
            if(week<min || count==0){
                min=week;
                index=i;
                count++;
            }
        System.out.println("Week"+(i+1)+": "+week+" mm");
        }

        System.out.println("\nMonthly Total:"+sum+"mm");
        System.out.println("Driest Week: Week"+index+"("+min+"mm)");
    }
}
