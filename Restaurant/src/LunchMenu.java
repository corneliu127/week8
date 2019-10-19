
public class LunchMenu {

	static final int MAX_ITEMS = 4;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public LunchMenu() {
		
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItem("Turkey Chedar Sandwich", "Roasted turkey, white chedar with fresh apple and cabbage slaw.", 8.99, "L1");
		addItem("Stake and White Cheddar Sandwich", "Grass fed beef, Vermont white cheddar, red onion, and horseradish sauce.", 9.99, "L2");
		addItem("Tuscan Grilled Chicken Sandwich", "Chicken, provolone, parmesan, smoky tomatoe, and basil mayo.", 10.79, "L3");
		addItem("Cuban Sandwich", "Artisan ham, shredded pork, swiss cheese, mustard, and sweet pickles.", 9.99, "L4");
	}

	private void addItem(String name, String description, double price, String orderCode) {
		
		MenuItem menuItem = new MenuItem(name, description, price, orderCode);
		
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, the menu is full! Can't add any more items.");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems++;
		}
		
	}
	
	public Iterator createIterator() {
		return new LunchMenuIterator(menuItems);
	}
	
	public MenuItem[] getMenuItems() {
		return menuItems;
	}	
	
	
}

