import java.util.Scanner;

public class stringMethods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        System.out.println(str1.charAt(2));
        System.out.println(str2.charAt(0));

        System.out.println(str1.toUpperCase());
        System.out.println(str2.toLowerCase());

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));

        System.out.println(str1.concat(str2));
        System.out.println(str1.substring(3));


    }
}
