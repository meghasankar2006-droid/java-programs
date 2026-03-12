import java.util.Scanner;
public class Prg14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int seat=sc.nextInt();
        int snum=sc.nextInt();
        int row=n*2;
        int count=1;
        for(int i=0;i<row;i++){
            for(int j=0;j<seat;j++){
                if(((i%2==0 && j%2==0)||(i%2==1 && j%2==1))&&count<=snum){
                    System.err.print("S00"+count+" ");
                    count++;
                }
                else{
                    System.out.print("---- ");
                }
            }
        System.out.println(" ");    
        }
        int tot=n*seat;
        System.out.println("Total Seats: "+tot);
        System.out.println("Occupied Seats: "+snum);
        System.out.println("Empty Seats: "+(tot-snum));
    }
}
