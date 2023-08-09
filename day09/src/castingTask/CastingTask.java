package castingTask;

public class CastingTask {
	public static void main(String[] args) {
		/* 10분
		 * CastingTask 클래스 
		 * Car 클래스의 객체를 생성하고 속도와 가격을 설정 
		 * Car 타입의 변수에 할당하고 출력 SportsCar
		 * 타입의 변수에 할당하고 최고 속도를 출력
		 */
		Car car = new Car(125, 250000);
		System.out.println("Car 클래스 스피드 "+ car.getSpeed());
		System.out.println("Car 클래스 가격 "+ car.getPrice());

		Car upCar = new SportsCar(280, 300000, 300);
		System.out.println("업캐스팅 스피드 " + upCar.getSpeed());
		System.out.println("업캐스팅 가격 " + upCar.getPrice());
		System.out.println("다운캐스팅 최고스피드 " + ((SportsCar)upCar).getTopSpeed());
	}
}
