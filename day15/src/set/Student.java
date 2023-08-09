package set;

public class Student {
	//필드
	int num;
	String name;
	
	//생성자
	public Student(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return this.num;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj instanceof Student) {
			return this.num == ((Student)obj).num;
		}
		return false;
	}
	
	
}










