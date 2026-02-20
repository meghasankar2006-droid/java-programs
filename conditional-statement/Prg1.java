import java.util.Scanner;
public class Prg1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int rate=sc.nextInt();
        int year=sc.nextInt();
        String str=sc.next().toLowerCase();
        float base=sc.nextFloat();
        String cr="critical";
        String ncr="non-critical";
        int per=0;
        int eligible=0;
        if(rate>=3){
            if(str.equals(cr)){
                if(rate==5 && (year>=5 && year<10)){
                    per=25;
                }
                else if(rate==4){
                    if(year>=10){
                    per=22;
                    }
                    else{
                        per=15;
                    }
                }
                else if(rate==3){
                    per=10;
                }
            }
            else if(str.equals(ncr)){
                if(rate==5){
                    per=18;
                }
                else if(rate==4){
                    per=12;
                }
                else if(rate==3){
                    per=8;
                }
            }
        eligible=1;
        }
        else{
            eligible=0;
        }
        float bonus=(base*per)/100;
        System.out.println("Performance Rating:"+rate);
        System.out.println("Years of Service:"+year);
        System.out.println("Department:"+str);
        System.out.println("Bonus Percentage:"+ per +"%");
        System.out.println("Bonus Amount:"+bonus);
        if(eligible==1){
        System.out.println("Status: Eligible");
        }
        else{
            System.out.println("Status:Not Eligible");
        }

    }

}
