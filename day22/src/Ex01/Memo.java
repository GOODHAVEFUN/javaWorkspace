package Ex01;

//import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Memo {
	public static void main(String[] args) {
		//번호 -> 실행
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		
		while(!exit) {
			System.out.println("1. 새 메모작성");
			System.out.println("2. 메모열기");
			System.out.println("3. 메모저장");
			System.out.println("4. 종료");
			System.out.println("번호 선택 : ");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
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
				exit = true;
				break;
			default:
				System.out.println("번호를 다시 선택하세요");
			}
		}
	}
	
	static void newMemo(Scanner sc) {
//		1번 새 메모 작성
//		사용자가 새 메모 내용을 작성할 수 있어야함
//		작성한 내용은 프로그램 종료 전까지 메모리에 저장되어야함
		System.out.println("메모 내용 입력 : ");
		StringBuilder sb = new StringBuilder();
		String line = null;
		
		while(!(line = sc.next()).isEmpty()) {
			sb.append(line).append(System.lineSeparator());
		}
		
		System.out.println("새 메모내용 : ");
		System.out.println(sb.toString());
	}
	
//	2번 메모 열기
//	사용자가 파일 이름을 입력하면 해당 파일의 내용을 화면에 출력해야함
//	파일이 없거나 읽기 오류가 발생하면 오류 메시지 표시
	static void openMemo(Scanner sc) {
		System.out.println("파일이름 입력 : ");
		String fileName = sc.nextLine();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line = null;
			System.out.println("파일내용 : ");
			
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			System.out.println("파일읽기 오류 " + e.getMessage());
		}
	}
	
//	3번 메모 저장
//	사용자가 입력한 파일 이름으로 현재 메모리에 저장된 메모 내용을 저장함
//	저장 중 오류가 발생하면 오류 메시지 표시
	static void saveMemo(Scanner sc) {
		System.out.println("파일이름 입력 : ");
		String fileName = sc.nextLine();
		System.out.println("메모내용 입력 : ");
		
		try {
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		String line;
		while(!(line = sc.nextLine()).isEmpty()) {
			bw.write(line);
			bw.newLine();
		}
		System.out.println("파일 저장 완료");
		
		}catch(IOException e){
//			e.printStackTrace();
			System.out.println("파일 쓰기 오류 " + e.getMessage());
		}
	}
}

















