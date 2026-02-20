import java.util.Scanner;
public class Prg2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int credit=sc.nextInt();
        double income=sc.nextDouble();
        double ratio=sc.nextDouble();
        String loantype=sc.next().toLowerCase();
        String decision="Rejected";
        double loan=0.0;
    //excellent
    if(credit>=750){
        if(ratio<=30.0){   //low
            if(loantype.equals("home")){
            decision="Approved";
            loan=4*income;
            }
            else if(loantype.equals("personal")){
                decision="Approved";
                loan=1*income;
            }
            else if(loantype.equals("business")){
                decision="Approved";
                loan=3*income;
            }
        }
        else if(ratio>30.0 && ratio<=40.0){ //moderate
                if(loantype.equals("business")){
                decision="Approved";
                loan=3*income;
            }
        }
    } 
    //good
    else if(credit>=700 && credit<750) {
        if(ratio<=30.0){  //low
            if(loantype.equals("business")){
                decision="Approved";
                loan=3*income;
        }
    }
        else if(ratio>30.0 && ratio<=40.0){  //moderate
            if(loantype.equals("business")){
                decision="Approved";
                loan=3*income;
            }
            else if(loantype.equals("home")){
                decision="Need Review";
                loan=3*income;
            }
        }
}
    //fair
    else if(credit>=650 && credit<700){
        if(ratio>30.0 && ratio<=40.0){ //moderate
            if(loantype.equals("personal")){
                decision="Need Review";
                loan=0.5*income;
        }
        if(loantype.equals("home")){
                decision="Need Review";
                loan=3*income;
        }
    } 
}
else{
    if(credit<650 && ratio>40.0)
    decision="Rejected";
    }

System.out.println("Credit Score: "+credit);
System.out.println( "Annual Income: $"+income);
System.out.println("Debt-to-Income Ratio: "+ratio+"%");
System.out.println("Loan Type: "+loantype);
System.out.println("Decision: "+ decision);
System.out.println("Maximum Loan Amount: $"+loan);
    }
}

