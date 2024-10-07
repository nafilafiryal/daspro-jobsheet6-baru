import java.util.Scanner;
public class shoes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String brand, category,size;
        double price = 0.0;
        System.out.print("Input Brand = ");
        brand = input.nextLine();
        System.out.print("Input Category = ");
        category = input.nextLine();
        System.out.print("Input Size = ");
        size = input.nextLine();

        if (brand.equalsIgnoreCase("converse")) {
            if (category.equalsIgnoreCase("slip on")) {
                if (size.equals("36")|| size.equals("37") || size.equals("38") || size.equals("39") || size.equals("40")) {
                    price = 800000;
                    System.out.println("Price = 800.000");
                } else {
                    System.out.println("Invalid size for Slip On Converse");
                }
                } else if (category.equalsIgnoreCase("high top")) {
                    if (size.equals("40")|| size.equals("41")||size.equals("42")||size.equals("43")||size.equals("44")) {
                        price = 1200000;
                        System.out.println("Price = 1.200.000");
                    } else {
                        System.out.println("Invalid Size for High Top on Converse");
                    }
                } else {
                    System.out.println("Invalid Category on Converse");
                }
            } else if (brand.equalsIgnoreCase("sketcher")) {
                if (category.equalsIgnoreCase("woman")) {
                    if (size.equals("36")||size.equals("37")||size.equals("38")||size.equals("39")||size.equals("40")||size.equals("41")) {
                        price = 1000000;
                        System.out.println("Price = 1.000.000");
                    } else {
                        System.out.println("Invalid Size for Sketcher Woman");
                    }
                    
                } else if (category.equalsIgnoreCase("man")) {
                    if (size.equals("41")||size.equals("42")||size.equals("43")||size.equals("44")) {
                        price = 1800000;
                        System.out.println("Price = 1.800.000");
                    } else {
                        System.out.println("Invalid Size for Sketcher Man");
                    }
                } else {
                    System.out.println("Invalid Category for Sketcher");
                }
            } else if (brand.equalsIgnoreCase("nike")) { 
                if (category.equalsIgnoreCase("kids")) {
                    if (size.equals("36")||size.equals("37")||size.equals("38")||size.equals("39")||size.equals("40")) {
                        price = 750000;
                        System.out.println("Price = 750.000");
                    }
                } else if (category.equalsIgnoreCase("adult")) {
                    if (size.equals("40")||size.equals("41")||size.equals("42")||size.equals("43")||size.equals("44")) {
                        price = 1500000;
                        System.out.println("Price = 1.500.000");
                    } else {
                        System.out.println("Invalid Size on Nike Adult");
                    }
                } else {
                    System.out.println("Invalid Category on Nike");
                }
            } else {
                System.out.println("Invalid Brand");
            }
        }
    }
    

