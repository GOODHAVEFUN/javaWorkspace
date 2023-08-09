package toy;

public class Main {
	
	public static void main(String[] args) {
		Company seoul = new Company("서울");
		Company busan = new Company("부산");
		Company dagu = new Company("대구");
		
		seoul.register(new Dog());
		
		busan.register(new Toy() {

			@Override
			public String[] speakList() {
				String[] list = {"사냥놀이할래", "애용!", "츄르줘"};
				return list;
			}

			@Override
			public void pushBtn(String speak) {
				System.out.println(speak);
			}
		});
		
//		대구지점에서 테스트용 장난감을 만든다
//		pushBtn은 오버라이딩 하지 않고 익명클래스로 메소드 호출
//		사자 장난감 =>
		dagu.register(new ToyAdapter() {
			
			@Override
			public String[] speakList() {
				String[] list = {"어흥!", "배고파"};
				return list;
			}
		});
	}
}
























