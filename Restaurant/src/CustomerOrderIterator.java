import java.util.ArrayList;

public class CustomerOrderIterator implements Iterator {

	ArrayList items;
	int position = 0;
	
	public CustomerOrderIterator(ArrayList items) {
		this.items = items;
	}
	
	
	public boolean hasNext() {
		if (position >= items.size()) {
			return false;
		} else {
			return true;
		}
	}

	public Object next() {

		Object object = items.get(position);
		position = position + 1;
		return object;
	}

}