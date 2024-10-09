import java.util.Scanner;
/**
 * book
 */
public class book {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String bookCategory, day;
        int numberOfBook, discount;
    
        
        System.out.print("What the Day = ");
        day = input.nextLine();

        if (day.equalsIgnoreCase("wednesday")) {
            System.out.print("Book Category = ");
            bookCategory = input.nextLine();
            if (bookCategory.equalsIgnoreCase("Dictionary")) {
                discount = 10;
                System.out.println("Get 10% discount");
                System.out.print("Number of Book Dictionary = ");
                numberOfBook = input.nextInt();
                if (numberOfBook>2) {
                    discount += 2;
                    System.out.println("Get discount + 2%");
                    System.out.print("Get discount = " + discount + "%  ");
                }
            } else if (bookCategory.equalsIgnoreCase("novel")) {
                discount = 7;
                System.out.println("Get 7% discount");
                System.out.print("Number of Book Novel = ");
                numberOfBook = input.nextInt();
                if (numberOfBook>3) {
                    discount += 2;
                    System.out.println("Get discount + 2% ");
                    System.out.println("Get discount = " + discount + "%");
                } else if (numberOfBook<3 || numberOfBook==3) {
                    discount += 1;
                    System.out.println("Get discount + 1% ");
                    System.out.println("Get discount = " + discount + "%");
                }
            } else if (bookCategory.equalsIgnoreCase("other category")) {
                System.out.print("Number of Book Other Category = ");
                numberOfBook = input.nextInt();
                if (numberOfBook>3) {
                    discount = 5;
                    System.out.println("Get discount 5% ");
                } else {
                    System.out.println("No discount");
                }
            }
        } else{
            System.out.print("No discount");
        }
    }
}