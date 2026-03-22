import java.util.Scanner;
public class arr1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        double sum=0.0;
        int acount=0;
        double []arr=new double[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextDouble();
            sum=sum+arr[i];
            
        }
        double avg=sum/num;

        for(int i=0;i<num;i++){
            if(arr[i]>avg){
                acount++;
            }
        }
        double per=(acount*100.0)/num;
        System.out.println("Total Employees: "+num);
        System.out.printf("Average Salary: %.2f  \n ",avg);
        System.out.println("Employees Above Average: "+acount);
        System.out.printf("Percentage: %.2f%% \n",per);


    }
}
