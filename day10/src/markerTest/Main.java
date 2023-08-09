package markerTest;

public class Main {
	public static void main(String[] args) {
		Main m = new Main();
		m.checkA(new Eagle());
		m.checkA(new Horse());
		m.checkA(new Tiger());
		
		//배열만들기 new 자료형[칸수], {값, 값, 값}
		Animal[] animals = {new Eagle(), new Horse(), new Tiger()};
//		System.out.println(animals);
		
		m.checkB(animals);
		
	}
	
	void checkA(Animal animal) {
		if(animal instanceof Carnivore) {
			System.out.println("육식동물!");
		}else if(animal instanceof Hervivore) {
			System.out.println("초식동물!");
		}
	}
	
	void checkB(Animal[] animal) {
		for(int i = 0; i < animal.length; i++) {
			if(animal[i] instanceof Sky) {
				System.out.println("날아다닌다");
			}else if(animal[i] instanceof Land) {
				System.out.println("걸어다닌다");
			}
		}
	}
}















