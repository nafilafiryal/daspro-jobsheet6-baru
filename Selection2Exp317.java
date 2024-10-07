import java.util.Scanner;

/**
 * Selection2Exp317
 */
public class Selection2Exp317 {

    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);
        String category;
        int income, netSalary;
        double tax = 0;

        System.out.print("Input Category = ");
        category = input17.nextLine();
        System.out.print("Input Income = ");
        income = input17.nextInt();

        if (category.equalsIgnoreCase("worker")) {
            if (income <=2000000) {
                tax = 0.1;
            } else if (income <= 3000000) {
                tax = 0.15;
            } else {
                tax = 0.2;
            }   
            netSalary = (int) (income - (tax*income));
            System.out.println("Nett Salary = "+netSalary);
            } 
            else if (category.equalsIgnoreCase("businessman")) {
                if (income <= 2500000) {
                    tax = 0.15;
                } else if (income <= 3500000) {
                    tax = 0.2;
                } else {
                    tax = 0.25;
                } netSalary = (int) (income - (tax*income));
                System.out.println("Nett Salary = " + netSalary);
            } else {
                System.out.println("Invalid category!");
            }
            
        }
    }
