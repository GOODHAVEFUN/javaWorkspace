package objectTest;

public class NewUser {
	//필드
	int userNumber;
	String userName;
	
	//생성자
	public NewUser() {
		super();
	}

	public NewUser(int userNumber, String userName) {
		super();
		this.userNumber = userNumber;
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "userNumber는 " + userNumber + " userName는 " + userName;
	}

	@Override
	public boolean equals(Object obj) {
		// 기존) 주소값을 비교하여 같을 경우 같음을 체크 return super.equals(obj);
		// 재정의) 원하는 값을 비교할 수 있는 조건을 사용하여 같음을 체크
	
		//자기자신과 비교하는 경우
		if(this == obj) {
			return true;
		}
		//null과 비교하는 경우
		if(obj == null) {
			return false;
		}
		//instanceof 대신 사용
		if(getClass() != obj.getClass()) {
			return false;
		}
		//위의 조건을 모두 만족하지 않고 번호을 비교하는 경우
		NewUser nu = (NewUser) obj;
		return userNumber == nu.userNumber;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
//		return super.hashCode(); //주소값
		return userNumber;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}











