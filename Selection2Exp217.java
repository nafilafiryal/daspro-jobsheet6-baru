import java.util.Scanner;
/**
 * Selection2Exp217
 */
public class Selection2Exp217 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angle1, angle2, angle3, totalAngle;
        System.out.print("Input Angle 1 = ");
        angle1 = input.nextInt();
        System.out.print("Input Angle 2 = ");
        angle2 = input.nextInt();
        System.out.print("Input Angle 3 = ");
        angle3 = input.nextInt();

        totalAngle = angle1+angle2+angle3;

        if (totalAngle==180) {
            if (angle1==90 || angle2==90 || angle3==90) {
                System.out.println("Right Triangle");
            } else {
                if (angle1==60 && angle2==60 && angle3==60) {
                   System.out.println("Equilateral Triangle"); 
                } else {
                    if (angle1==angle2 || angle2==angle3 || angle3==angle1) {
                        System.out.println("Isosceles Triangle");
                    } else {
                        System.out.println("Arbitary Triangle");
                    }
                }
            }
        
        } else {
            System.out.println("Not Triangle");
        }
    }
}