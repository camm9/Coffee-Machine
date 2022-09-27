import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Scanner;

//This is Coffee Vending Machine System. It allows customers to purchase a coffee at a time.  
//It shows the coffees and the corresponding prices of different sizes (small, medium, large). 
//It collects the purchase information from the customer to complete the order. 
//5% tax is added to the purchase.

public class CoffeeMachine {

	public static void main(String[] args) {
		// What Coffee Do They Want?
		boolean programLoop = true;
		while (programLoop == true) {
			programLoop = displayMenu();
		}

	}

	// Display coffee menu for customer and take their order
	public static boolean displayMenu() {
		Scanner scanner = new Scanner(System.in);
		int orderNum;
		char orderSize;

		Coffees coffee[] = new Coffees[5];
		Coffees coffeeSelected = new Coffees();
		// Create the coffee objects
		coffee[0] = new Coffees("Latte", 5.00, 4.45, 3.70);
		coffee[1] = new Coffees("Americano", 4.10, 3.50, 2.95);
		coffee[2] = new Coffees("Cappucino", 5.00, 4.55, 3.70);
		coffee[3] = new Coffees("Caramel Macchiato", 5.00, 4.5, 3.75);
		coffee[4] = new Coffees("Mocha", 6.00, 5.4, 4.50);

		System.out.println("Welcome to N&I Cafe");
		System.out.println("Please choose your coffee: ");
		System.out.println("Coffee 1: Latte ");
		System.out.println("Coffee 2: Americano ");
		System.out.println("Coffee 3: Cappucino ");
		System.out.println("Coffee 4: Caramel Machiatto ");
		System.out.println("Coffee 5: Mocha ");
		System.out.println("Enter coffee number: ");
		orderNum = scanner.nextInt();
		int coffeeNum = orderNum - 1;

		// Determine which coffee was selected
		coffeeSelected = coffee[coffeeNum];

		double priceFinal;
		double price = 0;

		String size = "";

		System.out.println(coffeeSelected.getName());
		System.out.println("Small: " + coffeeSelected.getSmallPrice() + " Medium: " + coffeeSelected.getMediumPrice()
				+ " Large: " + coffeeSelected.getLargePrice());

		System.out.println("Enter Size (S/M/L): ");
		orderSize = scanner.next().charAt(0);

		if (orderSize == 'S') {
			price = coffeeSelected.getSmallPrice();
			size = "Small";

		} else if (orderSize == 'M') {
			price = coffeeSelected.getMediumPrice();
			size = "Medium";

		} else if (orderSize == 'L') {
			price = coffeeSelected.getLargePrice();
			size = "Large";

		}

		char addOns;
		int milkNum = 0;
		int creamNum = 0;
		int sugarNum = 0;
		char orderConfirm;

		// Milk, Cream, Sugar add ons section
		System.out.println("Do you want (M)ilk, (C)ream, or (N)one? ");
		addOns = scanner.next().charAt(0);

		if (addOns == 'M') {

			System.out.println("How many milk do you want?");
			milkNum = scanner.nextInt();

		}

		else if (addOns == 'C') {
			System.out.println("How many cream do you want?");
			creamNum = scanner.nextInt();
		}

		System.out.println("How many sugars do you want?");
		sugarNum = scanner.nextInt();

		String milkCreamSugar = "";

		if (addOns == 'M') {

			milkCreamSugar = "(" + milkNum + " Milk and " + sugarNum + " Sugar)";

		}

		else if (addOns == 'C') {
			milkCreamSugar = "(" + creamNum + " Cream and " + sugarNum + " Sugar)";
		}

		else if (addOns == 'N') {
			milkCreamSugar = "(" + sugarNum + " Sugar)";
		}

		// Confirm Order Section
		System.out.println("Confirm Order (Y/N)?");
		orderConfirm = scanner.next().charAt(0);

		if (orderConfirm == 'Y' | orderConfirm == 'y') {
			System.out.println("Thank you for your purchase!");

		} else {
			System.out.println("Coffee Cancelled. Goodbye.");
			return true; // takes program back Main and the program starts over again
		}

		// Reprint order and total cost

		System.out.println(
				"Your " + size + " " + coffeeSelected.getName() + " " + milkCreamSugar + " is ready to serve.");

		priceFinal = price * 1.05; // Adding sales tax to coffee order

		DecimalFormat formatter = new DecimalFormat("##.00");
		String totalCost = formatter.format(priceFinal);
		System.out.println("Total Cost: $" + totalCost);

		scanner.close();

		return false; // Ends programLoop
	}

}