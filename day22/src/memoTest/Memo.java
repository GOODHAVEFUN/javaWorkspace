package memoTest;

//1. 콘솔기반 메모장 프로그램
//프로그램 실행되면 새 메모 작성, 메모열기, 메모저장, 종료 중 하나를 선택해야함
//
//1 새메모작성
//   사용자가 새 메모 내용을 작성할 수 있어야함
//   작성한 내용은 프로그램이 종료되기 전까지 메모리에 저장되어야함
//
//2 메모 열기
//   사용자가 파일 이름을 입력하면 해당 파일의 내용을 화면에 출력해야함
//   파일이 없거나 읽기 오류가 발생하면 오류 메시지 표시
//
//3 메모 저장
//   사용자가 입력한 파일 이름으로 현재 메모리에 메모 내용을 저장함
//   저장 중 오류가 발생하면 오류 메시지 표시
//4 종료
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Memo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1. 새 메모 작성");
			System.out.println("2. 메모 열기");
			System.out.println("3. 메모 저장");
			System.out.println("4. 종료");
			try {
				int choice = sc.nextInt();

				switch (choice) {
				case 1:
					newMemo(sc);
					break;
				case 2:
					openMemo(sc);
					break;
				case 3:
					saveMemo(sc);
					break;
				case 4:
					System.out.println("프로그램종료");
					sc.close();
					break;
				default:
					System.out.println("잘못입력");
					break;
				}
			} catch (Exception e) {
				System.out.println("잘못입력");
				e.setStackTrace(null);
			}

		}
	}

	private static void newMemo(Scanner sc) {
		System.out.print("새 메모 내용 작성: ");
		String memo = sc.next();
		try {
			FileWriter writer = new FileWriter("memo.txt");
			writer.write(memo);
			writer.close();
			System.out.println("메모 저장 완료");
		} catch (Exception e) {
			System.out.println("메모 저장 중 오류발생");
			e.printStackTrace();
		}
	}

	private static void openMemo(Scanner sc) {
		System.out.print("오픈할 파일 이름을 입력: ");
		String fileName = sc.next();
		// 파일을 열고 내용을 출력하는 로직을 작성하세요

		try {
			File file = new File(fileName);
			FileReader reader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			bufferedReader.close();
		} catch (Exception e) {
			System.out.println("메모 열기 중 오류 발생");
			e.printStackTrace();
		}
	}

	private static void saveMemo(Scanner sc) {
		System.out.print("저장할 메모 파일 이름 입력: ");
		String fileName = sc.next();
		System.out.print("덮어쓸 메모 내용 입력: ");
		String memo = sc.next();

		try {
			FileWriter writer = new FileWriter(fileName);
			writer.write(memo);
			writer.close();
			System.out.println("메모 저장");
			
		} catch (IOException e) {
			
			System.out.println("메모 저장 중 오류");
			
			e.printStackTrace();

		}
	}

}
