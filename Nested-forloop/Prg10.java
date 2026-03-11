import java.util.Scanner;
public class Prg10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int v=sc.nextInt();
        double min=0.0;
        

        for(int i=1;i<=n;i++){
            System.out.print("Vendor"+i+" ");
        }
        System.out.println("BestPrice");

        for(int i=0;i<n;i++){
            String pro=sc.next();
            System.out.print(pro+" ");
            for(int j=0;j<v;j++){
                double val=sc.nextDouble();
                System.out.printf("%.2f ",val);
                if(min>val||min==0.0){
                    min=val;
                }
            }
            System.out.printf("%.2f \n",min);
            min=0.0;
        }
    }
}
