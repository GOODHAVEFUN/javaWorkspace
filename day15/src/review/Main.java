package review;

class Student {
//	1. Student 클래스(Object 클래스의 메서드 오버라이딩)
//
//	필드 : name (이름) / age (나이) / studentId (학번)
	String name;
	int age;
	int studentId;

//	생성자 : 매개변수 있는 생성자
	public Student(String name, int age, int studentId) {
		super();
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}

	@Override
	public int hashCode() {
		return studentId;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj == null || getClass() != obj.getClass()) {
			return false;
		}
		
		Student student = (Student)obj;
		return age == student.age && studentId == student.studentId && name.equals(student.name);
	}

	@Override
	public String toString() {
		return "name = " + name + "\nage = " + age + "\nStudentId : " + studentId; 
	}
}	

public class Main{
	public static void main(String[] args) {
		
		Student st1 = new Student("짱구", 5, 1);
		Student st2 = new Student("철수", 6, 2);
		Student st3 = new Student("철수", 6, 1);
		Student st4 = new Student("짱구", 5, 1);

		//equals() 메소드로 객체간의 동등성 비교
		System.out.println(st1.equals(st4)); //true
		System.out.println(st2.equals(st3)); //false
		System.out.println(st1.equals(st3)); //false
		
		//hashCode() 메소드 해시코드 출력
		System.out.println(st1.hashCode());
		System.out.println(st4.hashCode());
		
		//toString() 메소드 모든 정보 출력
		System.out.println(st1.toString());
		System.out.println(st2.toString());
	}
}
//	Main 클래스(Student 클래스 객체 생성)
//		4개의 Student 객체를 생성 후 초기화
//		equals() 메서드를 사용하여 객체 간의 동등성 비교
//		hashCode() 메서드를 호출하여 해시 코드 출력
//		toString() 메서드를 호출하여 객체의 모든 정보 출력












