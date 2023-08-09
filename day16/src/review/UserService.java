package review;

import java.util.ArrayList;

public class UserService {
//	UserService 클래스를 선언한다
//	- 회원정보를 저장할 List를 private으로 선언한다
//	- 아이디 중복검사 메소드 정의
//	- 회원가입 메소드 정의
//	- 로그인 메소드 정의
	
	private ArrayList<UserVO> userList = new ArrayList<>();
	
	//아이디 중복검사 메소드
	public boolean chechId(String id) {
		//모든 회원정보를 하나씩 가져와서 변수에 담는다
		for(UserVO user : userList) {
			if(user.getId().equals(id)) {
				return false;
			}
		}
		return true;
	}
	
	//회원가입 메소드
	public void join(UserVO user) {
		userList.add(user);
	}
	
	//로그인 메소드
	public UserVO login(String id, String pw) {
		for(UserVO user : userList) {
			if(user.getId().equals(id) && user.getPw().equals(pw)) {
				return user;
			}
		}
		return null;
	}
}

















