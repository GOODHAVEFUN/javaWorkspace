package interTest2;

public class InterTest {
	public static void main(String[] args) {
		//InterTest 객체 it
		//Music 객체 music1 	, HipHop 참조값
		//Music 객체 music1 	, Rock 참조값
		InterTest it = new InterTest();
		Music music1 = new HipHop();	//업캐스팅
		Music music2 = new Rock();	//업캐스팅
//		Music music3 = new Ballad();

		it.check(music1);
		it.check(music2);
		it.check(new Ballad());
	}
	
	void check(Music music) {
		if(music instanceof Ballad) {
//			Ballad로 다운캐스팅
			Ballad ballad = (Ballad)music;
			ballad.mode();
			ballad.onlyBallad();
//			Ballad 클래스에 있는 메소드 호출
		}else if(music instanceof HipHop) {
//			HipHop 다운캐스팅
			HipHop hiphop = (HipHop)music;
//			HipHop 클래스에 있는 메소드 호출
			hiphop.mode();
			hiphop.onlyHipHop();
		}else {
//			Rock 다운캐스팅
			Rock rock = (Rock)music;
//			Rock 클래스에 있는 메소드 호출
			rock.onlyRock();
			rock.mode();
		}
	}
}













