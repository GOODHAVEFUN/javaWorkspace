package methodOverloading;

public class OverTask {
	public static void main(String[] args) {
		//메소드명 calcArea
		//도형의 넓이를 계산하는 메소드
		//원의 넓이 : Math.PI * 반지름 * 반지름
		//삼각형의 넓이 : (밑변 * 높이) /2.0
		//직사각형의 넓이(정수형) : 가로 * 세로
		
		OverTask ot = new OverTask();
		System.out.println(ot.calcArea(5.0));
		System.out.println(ot.calcArea(5.0, 10.5));
		System.out.println(ot.calcArea(5, 10));
	}
	
	double calcArea(double radius) {
		return Math.PI * radius * radius;
	}
	
	double calcArea(double b, double h) {
		return (b * h) / 2.0;
	}
	
	int calcArea(int w, int h) {
		return w * h;
	}
}
