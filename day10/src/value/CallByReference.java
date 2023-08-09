package value;

public class CallByReference {
	public static void main(String[] args) {
		Animal refA = new Animal();
		Animal refB = refA;
		
		System.out.println(refA);
		System.out.println(refB);
		
		refA.age = 10;
		refB.age = 20;
		
		System.out.println(refA.age); //20
		System.out.println(refB.age);
		
	}
}
