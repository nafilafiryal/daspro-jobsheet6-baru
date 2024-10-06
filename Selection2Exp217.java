import java.util.Scanner;
/**
 * Selection2Exp217
 */
public class Selection2Exp217 {

    public static void main(String[] args) {
        int angle1, angle2, angle3, totalAngle;
        Scanner input17 = new Scanner(System.in);

        System.out.print("Input angle1 = ");
        angle1 = input17.nextInt();
        System.out.print("Input angle2 = ");
        angle2 = input17.nextInt();
        System.out.print("Input angle3 = ");
        angle3 = input17.nextInt();

        totalAngle = angle1 + angle2 + angle3;

        if (totalAngle==180) {
            if (angle1==90 || angle2==90 || angle3==90) {
                System.out.println("Right triangle");
            } else {System.out.println("Not a Right Triangle");}
        } else {System.out.println("Not a Triangle");}

    }
}