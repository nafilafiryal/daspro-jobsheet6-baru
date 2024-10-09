import java.util.Scanner;
/**
 * book
 */
public class book {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String bookCategory, day;
        int numberOfBook, discount1Dictionary, discount2Dictionary, discount1Novel, discount2Novel, discount3Novel, discount1OtherCat;
    
        
        System.out.print("What the Day = ");
        day = input.nextLine();

        if (day.equalsIgnoreCase("wednesday")) {
            System.out.print("Book Category = ");
            bookCategory = input.nextLine();
            if (bookCategory.equalsIgnoreCase("Dictionary")) {
                discount1Dictionary = 10;
                System.out.println("Get 10% discount");
                System.out.print("Number of Book Dictionary = ");
                numberOfBook = input.nextInt();
                if (numberOfBook>2) {
                    discount2Dictionary = 2;
                    System.out.println("Get discount + 2%");
                    System.out.print("Get discount = " + discount1Dictionary + "%  + " + discount2Dictionary + "%");
                } else {
                    System.out.println("Get discount 10%");
                }
            } else if (bookCategory.equalsIgnoreCase("novel")) {
                discount1Novel = 7;
                System.out.println("Get 7% discount");
                System.out.print("Number of Book Novel = ");
                numberOfBook = input.nextInt();
                if (numberOfBook>3) {
                    discount2Novel = 2;
                    System.out.println("Get discount + 2% ");
                    System.out.println("Get discount = " + discount1Novel + "% + " + discount2Novel + "%");
                } else if (numberOfBook<3 || numberOfBook==3) {
                    discount3Novel = 1;
                    System.out.println("Get discount + 1% ");
                    System.out.println("Get discount = " + discount1Novel + "% + " + discount3Novel + "%");
                }
            } else if (bookCategory.equalsIgnoreCase("other category")) {
                System.out.print("Number of Book Other Category = ");
                numberOfBook = input.nextInt();
                if (numberOfBook>3) {
                    discount1OtherCat = 5;
                    System.out.println("Get discount 5% ");
                } else {
                    System.out.println("No discount");
                }
            } else {
                System.out.println("Invalid Book Category");
            }
        } else{
            System.out.print("No discount");
        }
    }
}