package review03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		UserMananger um = new UserMananger();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1. 사용자 등록");
			System.out.println("2. 사용자 로그인");
			System.out.println("3. 사용자 로그아웃");
			System.out.println("4. 프로필 수정");
			System.out.println("5. 종료");
			System.out.println("번호 입력 : ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.println("이름입력 : ");
				String name = sc.nextLine();
				System.out.println("비밀번호입력 : ");
				String passwd = sc.nextLine();
				um.registerUser(name, passwd);
				break;

			case 2:
				System.out.println("이름입력 : ");
				String loginName = sc.nextLine();
				System.out.println("비밀번호 입력 : ");
				String loginPw = sc.nextLine();
//				um.login(loginName, loginPw);
				Thread loginThread = new Thread(new LoginTask(um, loginName, loginPw));
				loginThread.start();
				break;

			case 3:
				um.logout();
				break;

			case 4:
				System.out.println("새로운 비밀번호 입력 : ");
				String newPasswd = sc.nextLine();
				um.updateUser(newPasswd);
				break;
			case 5:
				System.out.println("프로그램 종료합니다");
				return;
			default:
				System.out.println("번호를 다시 입력하세요");
				break;
			}
			System.out.println();
		}
	}
}