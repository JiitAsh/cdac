package cdac.cart;

import java.util.Iterator;
import java.util.Vector;

public class ShoppingCart implements Cart {

	Vector<CartItem> items = new Vector<>();

	@Override
	public void addItem(CartItem item) {
		items.add(item);
	}

	@Override
	public void deleteItem(CartItem item) {
		items.remove(item);
	}

	@Override
	public Iterator<CartItem> listCart() {

		return items.iterator();
	}

}
