import java.util.Scanner;
public class arr6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        double []arr=new double[num];
        double sum=0.0;
        for(int i=0;i<num;i++){
            arr[i]=sc.nextDouble();
            sum=sum+arr[i];
        }
        double avg=sum/num;
        int count=0;
        int k=0;
        int []a=new int[num];
        for(int i=0;i<num;i++){
            if(arr[i]>(avg*2)){
                count++;
                a[k]=i;
                k++;
            }
        }
        System.out.println("Total Transactions: "+num);
        System.out.printf("Average Transaction: $ %.2f \n",avg);
        System.out.println("Suspicious Transactions: "+count);
        System.out.print("Fraud Alert Indices: [");
        for(int i=0;i<k;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("]");

    }
}
