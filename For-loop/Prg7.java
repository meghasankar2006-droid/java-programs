import java.util.Scanner;
public class Prg7 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      double bill=0.0;
      double sum=0.0;
      int usum=0;
      for(int i=1;i<=n;i++){
        String cusid=sc.next();
        int unit=sc.nextInt();
        usum=usum+unit;
        if(unit>0 && unit<=100){
            bill=unit*0.10;
        }
        else if(unit<=200){
        
            bill=(100*0.10)+((unit-100)*0.13);
        }
        else if(unit<=300){
            bill=(100*0.10)+(100*0.13)+((unit-200)*0.16);
        }
        else if(unit>300){
            bill=(100*0.10)+(100*0.13)+(100*0.16)+((unit-300)*0.20);
        }
        sum=sum+bill;
        String cat=" ";
        if(unit<=200){
            cat="Low Usage";
        }
        else if(unit<=300){
            cat="Medium Usage";
        }
        else if(unit>300){
            cat="High Usage";
        }
        System.out.println("Consumer ID:"+cusid);
        System.out.println("Units Consumed:"+unit);
        System.out.println("Bill Amount: $"+bill);
        System.out.println("Category: "+cat);
        System.out.println(" ");
      }  
      System.out.println("Total Consumers: "+n);
      System.out.println("Total Units Consumed: "+usum);
      System.out.println("Total Revenue: $"+sum);
      System.out.println(" Average Bill: $"+(sum/n));  
      sc.close();
      }
}
