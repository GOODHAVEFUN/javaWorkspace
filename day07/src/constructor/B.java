package constructor;

public class B {
	//필드
	int num;
	
	//메소드
	void printNum(int num) {
		System.out.println("num >> "+ num);
		System.out.println("num >> "+ this.num);
		System.out.println("참조값 >> " + this);
	}
}
