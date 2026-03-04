import java.util.Scanner;
public class Prg18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0;
        double htemp=0.0;
        int min=0;
        double ltemp=0.0;
        double tsum=0.0;
        int hcount=0,ccount=0;

        for(int i=1;i<=n;i++){
            int hours=sc.nextInt();
            double temp=sc.nextDouble();
            tsum=tsum+temp;
            if(hours>max){
                max=hours;
                htemp=temp;
            }
            if(hours<min || min==0){
                    min=hours;
                    ltemp=temp;
                }
            String status=" ";
            if(hours>40 || temp<0){
                status="Extreme";
            }
            else if(hours>32 && hours<=40){
                status="Hot";
                hcount++;
            }
            else if(hours>10 && hours<=32){
                status="Normal";
            }
            else if(hours>=0 && hours<=10){
                status="cold";
                ccount++;
            }
            System.out.println("Hours"+hours+" : "+temp);
            System.out.println("Status : "+status);
            System.err.println("");
        }
        double avg=tsum/n;
        System.err.println("Total Readings:"+n);
        System.err.printf("Average Temperature: %.2f \n",avg);
        System.err.println("Highest Temperature: "+htemp+" at hours "+max);
        System.err.println("Lowest Temperature: "+ltemp+" at hours "+min);
        System.err.println("Hot Hours: "+hcount);
        System.err.println("Cold Hours:"+ccount);
        sc.close();

    }
}
