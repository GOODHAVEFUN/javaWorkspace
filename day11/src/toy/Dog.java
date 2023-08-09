package toy;

public class Dog implements Toy{

	@Override
	public String[] speakList() {
		String[] list = {
				"안녕",
				"배고파 밥줘",
				"멍멍!",
				"산책가자!"
		};
		
		return list;
	}

	@Override
	public void pushBtn(String speak) {
		System.out.println(speak);
	}
	
}













