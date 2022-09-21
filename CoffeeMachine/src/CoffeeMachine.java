import java.lang.reflect.Array;
import java.util.Scanner;

//This ia Coffee Vending Machine System. It allows customers to purchase a coffee at a time.  
//It shows the coffees and the corresponding prices of different sizes (small, medium, large). 
//It collects the purchase information from the customer to complete the order. 
//5% tax is added to the purchase.



public class CoffeeMachine {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double coffeePrice = displayMenu();
		getOrder();
		displayTotal(coffeePrice);
		confirmOrder();
		
	}
	//Display coffee menu for customer
	public static double displayMenu() {
		Scanner scanner = new Scanner(System.in);
		int orderNum;
		String orderSize;
		double coffeePrice = 0;
		Coffees coffee[]= new Coffees[5];
		
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
		System.out.println(coffee[coffeeNum].getName());
		System.out.println("Small: " + coffee[coffeeNum].getSmallPrice() + " Medium: " + coffee[coffeeNum].getMediumPrice() + " Large: " + coffee[coffeeNum].getLargePrice());
		
		
		System.out.println("Enter Size (S/M/L): ");
		orderSize = scanner.next();
		
		if (orderSize == "S") {
			coffeePrice = coffee[coffeeNum].getSmallPrice();
		}
		else if (orderSize == "M") {
			coffeePrice = coffee[coffeeNum].getMediumPrice();
		}
		else if (orderSize == "L") {
			coffeePrice = coffee[coffeeNum].getLargePrice();
		}
		
		return coffeePrice;
		
	
		
	}
	//Receive the customer's order
	public static void getOrder() {
		Scanner scanner = new Scanner(System.in);

		String addOns;
		int milkNum = 0;
		int creamNum = 0;
		int sugarNum = 0;
		String orderConfirm;
		
	
		System.out.println("Do you want (M)ilk, (C)ream, or (N)one? ");
		addOns = scanner.nextLine();
		
		if (addOns == "M") {
		
			milkNum = displayMilkAddOns();
			
		}
		
		else if (addOns == "C") {
			creamNum = displayCreamAddOns();
		}
		else {
			sugarNum = displaySugarAddOns();
		}

	}
	
	public static int displayMilkAddOns() {
		int milkNum;
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("How many milk do you want?");
		milkNum = scanner.nextInt();
		return milkNum;
		
		
	}
	
	public static int displayCreamAddOns() {
		int creamNum;
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many cream do you want?");
		creamNum = scanner.nextInt();
		return creamNum;
		
		
	}
	
	public static int displaySugarAddOns() {
		int sugarNum;
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many sugars do you want?");
		sugarNum = scanner.nextInt();
		return sugarNum;
		
		
	}
	
	public static void confirmOrder() {
		
		//get size and name of coffee 
		
		//get number of milk
		
		// get number of sugar
		
		//get number of cream
		Scanner scanner = new Scanner(System.in);
		System.out.println("Confirm Order (Y/N)?");
		String orderConfirm = scanner.nextLine();
		
		if (orderConfirm == "Y") {
			System.out.println("Thank you for your purchase!");
			
			
			
		}
		else {
			System.out.println("Coffee Cancelled. Goodbye.");
		}
		
	}
	
	public static void displayTotal(double coffeePrice) {
		double totalCost = coffeePrice * 1.05;
		System.out.println("Total Cost: "+ totalCost);
	}
	
	
	
}
