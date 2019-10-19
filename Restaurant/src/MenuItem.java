
public class MenuItem {
	String name;
	String description;
	String orderCode;
	double price;
 
	public MenuItem(String name, 
	                String description, 
	                double price,
	                String orderCode) 
	{
		this.name = name;
		this.description = description;
		this.orderCode = orderCode;
		this.price = price;
	}
  
	// getters and setters
	
	public String getName() {
		return name;
	}
  
	public String getDescription() {
		return description;
	}
  
	public double getPrice() {
		return price;
	}
  
	public String getOrderCode () {
		return orderCode;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public void setPrice(double price) {
		this.price = price;
	}	
	
}