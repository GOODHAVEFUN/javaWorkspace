package section08;

public class EX_05 {
	public static void main(String[] args) {
		Jogger jogger = new Jogger();
		jogger.name="이우진"; //jogger인스턴스 name에 "이우진" 값 집어넣기
		
		jogger.sayName(); //sayName 호출
//		void sayName() {
//			System.out.println("제이름은 "+name+ "입니다");
//		}
		
		jogger.run();
//		void run() {//run 메서드 선언
//			System.out.println("run run run!");
//		}
		
	}
}
