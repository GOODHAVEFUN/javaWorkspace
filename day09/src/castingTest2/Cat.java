package castingTest2;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
	}

	@Override
	void crying() {
		System.out.println("야옹");
	}
}
