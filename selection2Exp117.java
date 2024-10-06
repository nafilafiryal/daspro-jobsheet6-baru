import java.util.Scanner;

public class selection2Exp117 {
    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);
        int year;
        System.out.print("Input year = ");
        year = input17.nextInt();
        if (year%4 == 0) {
            if (year%100 == 0) {
               if (year%400 == 0) {
                System.out.println("leap year");
               } else {System.out.println("Not a Leap year");}
            } else {System.out.println("Leap year");}
        } else {System.out.println("Not a leap year");}
    }
}