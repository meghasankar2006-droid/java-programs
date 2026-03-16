import java.util.Scanner;
public class arr11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double []quan=new double[n];
        double []price=new double[n];
        for(int i=0;i<n;i++){
            quan[i]=sc.nextDouble();
        }
        for(int i=0;i<n;i++){
            price[i]=sc.nextDouble();
        }
        double []value=new double[n];
        double sum=0.0;
        for(int i=0;i<n;i++){
            value[i]=quan[i]*price[i];
            sum=sum+value[i];
        }
        double max=value[0];
        double min=value[0];
        int mindex=0,maxindex=0;
        for(int i=0;i<n;i++){
            if(value[i]>max){
                max=value[i];
                maxindex=i+1;
            }
            if(value[i]<min){
                min=value[i];
                mindex=i+1;
            }
        }
        System.out.println("Number of Assets:"+n);
        System.out.println("Total Portfolio Value: $"+sum);
        System.out.println("Most Valuable Asset: Asset "+maxindex+"($"+max+")");
        System.out.println("Least Valuable Asset: Asset "+mindex+"($"+min+")");

    }
}
