import java.util.ArrayList;


public class BreakfastMenu {
	ArrayList<MenuItem> menuItems;
	
	public BreakfastMenu() {
		menuItems = new ArrayList<MenuItem>();
		
		addItem("Breakfast Tacos","Eggs mixed with sausage, thinck tbacon or chorizo, cheese & onions.", 7.99, "B1");
		addItem("French Toast","Freshly baked French bread topped twith organic cinnamon sugar.", 6.75, "B2");
		addItem("Smoked Sausage & Eggs","Sausage grilled and served with 2 farm fresh eggs.", 8.99, "B3");

	}

	private void addItem(String name, String description, double price, String orderCode) {
		MenuItem menuItem= new MenuItem(name, description, price, orderCode);
		menuItems.add(menuItem);
		
	}
	
	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}

	public Iterator createIterator() {
		return new BreakfastMenuIterator(menuItems);
	}

	public String toString() {
		return "Breakfast Menu";
	}
}
