package Ex03;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String name;
	private String password;

	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}
}

class UserManager {
	private List<User> users;
	private User loginUser;
	// 기존비밀번호로 로그인 후 프로필 수정하고 로그아웃한 뒤 새로운 비밀번호로 로그인하기
	// 1. 새로운 비밀번호를 저장할 필드 생성
	private String newPassword;

	public UserManager() {
		users = new ArrayList<>();
		loginUser = null;
	}

	public void registerUser(String name, String password) {
		for (User user : users) {
			if (user.getName().equals(name)) {
//            System.out.println("존재하는 사용자입니다");
//            return;
				throw new IllegalArgumentException("존재하는 사용자입니다");
			}
		}

		User user = new User(name, password);
		users.add(user);
		System.out.println("사용자가 등록되었습니다");
	}

	public void login(String name, String password) {
		if (loginUser != null) {
//         System.out.println("이미 로그인되어있습니다");
//         return;
			throw new IllegalStateException("이미 로그인되어있습니다");
		}

		for (User user : users) {
			if (user.getName().equals(name)) {
				if (user.getPassword().equals(password)) {
					loginUser = user;
					System.out.println("로그인되었습니다");
					return;
				} else if (user.getPassword().equals(newPassword)) {
					loginUser = user;
					System.out.println("로그인되었습니다");
					return;
				} else {
//               System.out.println("비밀번호가 일치하지 않습니다");
//               return;
					throw new IllegalArgumentException("비밀번호가 일치하지 않습니다");
				}
			}
//         System.out.println("사용자 존재하지 않습니다");
			throw new IllegalArgumentException("사용자가 존재하지 않습니다");
		}
	}

	public void logout() {
		if (loginUser == null) {
//         System.out.println("로그인된 사용자가 없습니다");
			throw new IllegalStateException("로그인된 사용자가 없습니다");
		} else {
			loginUser = null;
			System.out.println("로그아웃 되었습니다");
		}
	}

	public void updateUser(String newPassword) {
		if (loginUser == null) {
//         System.out.println("로그인된 사용자가 없습니다");
			throw new IllegalStateException("로그인된 사용자가 없습니다");
		}
//      else {
//         loginUser = new User(loginUser.getName(), newPassword);
//         System.out.println("프로필이 업데이트 되었습니다");
//      }

		// 2. 새로운 비밀번호를 입력받을 수 있도록하고 newPassword 필드에 저장
		this.newPassword = newPassword;
		System.out.println("프로필이 업데이트 되었습니다");
	}
}
















