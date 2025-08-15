import java.util.ArrayList;
import java.util.Scanner;

class Bill {
	String itemName;
	int itemPrice;
	int quality;
	int subTotal;

	public Bill(String itemName, int itemPrice, int quality, int subTotal) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.quality = quality;
		this.subTotal = subTotal;
	}

	public String toString() {
		return itemName + "         " + itemPrice + "            " + quality + "           " + subTotal;
	}
}

public class LaunchHotelBillingSystem {
	public static void main(String[] args) {

		String name = null;
		int itemId = 0;
		int quantity = 0;
		String itemName = null;
		int itemPrice = 0;
		int subTotal = 0;
		String choice = null;
		int total = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("<------Welcome to Taj Hotel------>");
		System.out.println("Dear customer, please enter your name");
		name = sc.nextLine();

		ArrayList<Bill> newBill = new ArrayList<>();

		do {
			System.out.println("Dear " + name + ", below is the menu");
			System.out.println("-------------------------------------------------------");
			System.out.println("Item ID            Item Name               Item Price");
			System.out.println();
			System.out.println("-------------------------------------------------------");
			System.out.println("1                  Water                   10");
			System.out.println("2                  Pepsi                   30");
			System.out.println("3                  Fries                   100");
			System.out.println("4                  Burger                  150");
			System.out.println("5                  Pizza                   200");
			System.out.println();
			System.out.println("--------------------------------------------------------");

			System.out.println("Dear " + name + " Please Enter the ItmeId");
			itemId = sc.nextInt();

			System.out.println("Dear " + name + " Please enter the quantity");
			quantity = sc.nextInt();

			switch (itemId) {
			case 1:
				itemName = "Water";
				itemPrice = 10;
				subTotal = itemPrice * quantity;
				break;
			case 2:
				itemName = "Pepsi";
				itemPrice = 30;
				subTotal = itemPrice * quantity;
				break;
			case 3:
				itemName = "Fries";
				itemPrice = 100;
				subTotal = itemPrice * quantity;
				break;
			case 4:
				itemName = "Burger";
				itemPrice = 150;
				subTotal = itemPrice * quantity;
				break;
			case 5:
				itemName = "Pizza";
				itemPrice = 200;
				subTotal = itemPrice * quantity;
				break;

			default:
				System.out.println("Invalid choice. Dear customer Please Re-enter the item ID(1-5)");
			}
			System.out.println("Your ItemId is "+itemId + " you have ordered " + itemName + " the price of your order is : Rs " + itemPrice + " and sub Total is : Rs " + subTotal);
			total = total + subTotal;

			Bill b = new Bill(itemName, itemPrice, quantity, subTotal);
			newBill.add(b);

			System.out.println("Do you want to order anything more(yes/no)");
			choice = sc.next();

		} while (choice.equalsIgnoreCase("yes"));

		System.out.println("---------------------------------------------------------");
		System.out.println("Item Name     Item Price     Quality     Sub Total");
		System.out.println("---------------------------------------------------------");

		for (Bill x : newBill) {
			System.out.println(x);
		}
		System.out.println("---------------------------------------------------------");
		System.out.println("Your Payable bill amount is : Rs" + total);
		System.out.println("---------------------------------------------------------");

		float grandTotal = total + (total * 0.05f);
		System.out.println("By including GST your Payable amount is : Rs " + grandTotal);
	}
}
