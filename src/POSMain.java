import java.util.Scanner;

/**
 * Midterm Project Grand Circus
 *
 * Java June 2017
 *
 * (Alphabetical Order)
 * Michael Gleeson
 * Matthew Menna
 * Mark Ritter
 * Vernon Scott
 *
 */

public class POSMain {
    public static void main(String[] args) {
        System.out.println("Welcome to M3V! My Name is Jarvis, How can I serve you? ");

        boolean cont = true;
        int caseNumber;
        Scanner scnr = new Scanner(System.in);
        OOValidator validator = new OOValidator();
        Product menu = new Product();
        Product cart = new Product();
        menu.createMenu(0);

        System.out.println("POS Terminal Console");

        while (cont) {
            caseNumber = validator.getIntWithinRange("1: View Menu\n2: Add Item to Menu\n3: Add Item to Cart\n4: Checkout\n", 1, 3);
            switch (caseNumber) {
                case 1:
                    System.out.println(menu.toString());
                    break;
                case 2:
                    menu.getItem(validator.getIntWithinRange("What item would you like to add to menu? Please refer to line number.", 1, 4));
                    System.out.println("New Cart is \n" + menu.toString());
                    break;
                case 3:
                    cart.getItem(validator.getIntWithinRange("What item would you like to add to cart? Please refer to line number.", 1, 4));
                    System.out.println("New Cart is \n" + cart.getCart());
                    break;
                case 4:
                    break;
                default:
                    break;
            }
            //cont = validator.getContinue("Continue? (y/n)", scnr.nextLine());
        }
    }
}
