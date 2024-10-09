import java.util.Scanner;
public class number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, max;

        System.out.print("Input Number 1 = ");
        num1 = input.nextInt();
        System.out.print("Input Number 2 = ");
        num2 = input.nextInt();
        System.out.print("Input Number 3 = ");
        num3 = input.nextInt();

        max=num1;
        System.out.println("Max number is = " + num1);
        if (num2>max) {
            System.out.print("Max number is = " + num2);
        } if (num3>max) {
            System.out.print("Max number is = " + num3);
            
        } else if (num2==max) {
            System.out.println("Max number is = " + num2);
            
        }
    }
}