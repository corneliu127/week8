import java.util.ArrayList;


public class CustomerOrder {
	ArrayList<MenuItem> menuItems;
	
	public CustomerOrder() {
		menuItems = new ArrayList<MenuItem>();
		
		addItem("Breakfast Tacos","Eggs mixed with sausage, thinck tbacon or chorizo, cheese & onions.", 7.99, "B1");
		addItem("French Toast","Freshly baked French bread topped twith organic cinnamon sugar.", 6.75, "B2");
		
	}

	private void addItem(String name, String description, double price, String orderCode) {
		MenuItem menuItem= new MenuItem(name, description, price, orderCode);
		menuItems.add(menuItem);
		
	}

	
	
	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}

	public Iterator createIterator() {
		return new CustomerOrderIterator(menuItems);
	}

	public String toString() {
		return "Customer Order is Here.";
	}
}