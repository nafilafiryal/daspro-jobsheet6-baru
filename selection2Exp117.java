import java.util.Scanner;

public class selection2Exp117 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        System.out.print("Input year = ");
        year = input.nextInt();
        if(year%4 == 0)
            if(year%100 != 0)
                System.out.println("Leap year");
                else
                System.out.println("Not a Leap Year");       
    }   
}