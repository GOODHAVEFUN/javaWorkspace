package test;

public class Product {
	String name;
	int price;
	int ea;
	String category;
	
	public void showProduct(String name,int price,int ea,String category) {
		System.out.println("상품이름:"+name);
		System.out.println("가격:"+price);
		System.out.println("수량:"+ea);
		System.out.println("종류:"+category);
	}
	
}
