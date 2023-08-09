package test;

public class ProductOrder extends Product {
	String orderName;
	String cart;
	String address;

	@Override
	public String showProduct(String name, int price, int ea, String category) {
		// TODO Auto-generated method stub
		return super.showProduct(name, price, ea, category);
	}

	public void addProduct() {
		cart = showProduct(orderName, price, ea, address);
	}

	public void showOrder(String orderName, String cart, String address) {
		for
		showProduct(orderName, price, ea, address);
	}

}
