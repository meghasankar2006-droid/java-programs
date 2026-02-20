import java.util.Scanner;
public class Prg4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String loyaltytier=sc.next().toLowerCase();
        double cartvalue=sc.nextDouble();
        String product=sc.next().toLowerCase();
        String membership=sc.next().toLowerCase();
        int basediscount=0;
        if(loyaltytier.equals("bronze")){
            basediscount=5;
        }
        else if(loyaltytier.equals("silver")){
            basediscount=8;
        }
        else if(loyaltytier.equals("gold")){
            basediscount=12;
        }
        else if(loyaltytier.equals("platinum")){
            basediscount=15;
        }
    int add=0;
    if (cartvalue>500 && cartvalue<1000) {
        add=3;
    } 
    else if(cartvalue>999 && cartvalue<2000) {
        add=5;
    }
    else if(cartvalue>=2000){
        add=7;
    }
    if(product.equals("electronics") && (membership.equals("prime"))){
            add=add+5;
    }
    else if(product.equals("fashion")){
        add=add+3;
    } 
    else if(product.equals("books") && (membership.equals("prime"))){
            add=add+5;
    } 
    else if(product.equals("groceries") && cartvalue>300){
        add=add+2;
    }
    int totaldis=basediscount+add;
    double savings=(cartvalue*totaldis)/100;
    double finalprice=cartvalue-savings;
    System.out.println("Loyalty Tier:"+loyaltytier);
    System.out.println("Cart Value: "+cartvalue);
    System.out.println("Product Category: "+product);
    System.out.println("Membership: "+membership);
    System.out.println("Base Discount:"+basediscount+"%");
    System.out.println("Additional Discount:"+add+"%");
    System.out.println("Total Discount:"+totaldis+"%");
    System.out.println("Final Price: $"+finalprice);
    System.out.println("Savings: $"+savings);
    }
}
