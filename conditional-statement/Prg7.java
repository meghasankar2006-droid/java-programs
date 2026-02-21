import java.util.Scanner;
public class Prg7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int heartrate=sc.nextInt();
        int systolic =sc.nextInt();
        int diastolic=sc.nextInt();
        double temperature=sc.nextDouble();
        String symptom=sc.next();

        String priority=" ";
        String time="0";
        String action=" ";

        if(symptom.equals("Life-Threatening")|| (heartrate<50 ||heartrate>130)||(systolic>180 || systolic<90)||(temperature>103 || temperature<96)){
            priority="Critical";
            time="0";
            action="Immediate Emergency Care";

            }
        
        else if(((heartrate>=50 && heartrate<=60)||(heartrate>=110 && heartrate<=130))||((systolic>=160 && systolic<=180)||(systolic>=90 && systolic<=100))||(temperature>=101 && temperature<=103)||(temperature>=96 && temperature<=97)){
            if((symptom.equals("Severe"))){
            priority="Urgent";
            time="15";
            action="Priority Medical Attention";
            }
            else if(symptom.equals("Moderate")){
                priority="Urgent";
            time="20";
            action="Priority Medical Attention";
            }
        }
        

        else if(symptom.equals("Moderate")){
            priority="Standard";
            time="45";
            action="Standard Examination";
        }

        else{
            priority="Non-Urgent";
            time="90";
            action=" Routine Check-up";
        }
    System.out.println("Heart Rate:"+heartrate+" bpm");
    System.out.println("Blood Pressure: "+systolic+"/"+diastolic);
    System.out.println("Temperature:"+temperature+" F");
    System.out.println("Symptom Severity:"+symptom);
    System.out.println("Triage Priority:"+priority);
    System.out.println("Estimated Wait Time:"+time +" Minutes");
    System.out.println("Recommended Action: "+action);

    }
}

