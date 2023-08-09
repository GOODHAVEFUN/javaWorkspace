package objectTest;

public class MyObject {
	//Object 클래스를 상속
	//필드 int value
	//생성자 기본생성자, 매개변수가 있는 생성자
	//오버라이딩 equals(), toString(), hashCode()
	
	int value;

	public MyObject() {
		super();
	}

	public MyObject(int value) {
		super();
		this.value = value;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
//		return super.hashCode();
		return value;
	}

	@Override
	public boolean equals(Object obj) {
//		return super.equals(obj);
		if(this == obj) {
			return true;
		}
		
		if(obj == null || getClass() != obj.getClass()) {
			return false;
		}
		
		MyObject mo = (MyObject) obj;
		return this.value == mo.value;
		
	}

	@Override
	public String toString() {
//		return super.toString();
		return "MyObject 클래스의 value 값은 " + value;
	}
	
	public static void main(String[] args) {
		MyObject m1 = new MyObject(10);
		MyObject m2 = new MyObject(20);
		
		System.out.println("m1 : " + m1);
		System.out.println("m2 : " + m2);
		System.out.println("m1.equal(m2) : " + m1.equals(m2));
		System.out.println("m1.hashcode() : " + m1.hashCode() );
		System.out.println("m2.hashcode() : " + m2.hashCode() );
	}
}
