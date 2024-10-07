import java.util.Scanner;
public class baru {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int angle1, angle2, angle3, totalAngle;
        System.out.println("Input angle 1 = ");
        angle1 = input.nextInt();
        System.out.println("Input angle 2 = ");
        angle2 = input.nextInt();
        System.out.println("Input angle 3 = ");
        angle3 = input.nextInt();

        if (totalAngle==180) {
            if (angle1==90 || angle2==90 || angle3==90)
            System.out.println("Right Triangle");
        } else {System.out.println("Not a Right Triangle");}
        else {System.out.println("Not a Triangle");}
    }
}