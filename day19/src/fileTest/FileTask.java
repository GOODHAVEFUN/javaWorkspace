package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {
	public static void main(String[] args) throws IOException {
		//animal.txt 파일 생성하고 연다
		//동물 이름을 담고있는 animals 배열을 생성한다 {"","","",""} 동물 4개이상 
		//animals 배열의 각 요소를 파일에 줄바꿈하면서 쓴다
		//파일의 각 줄을 읽어와서 출력한다
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("animal.txt")));
		
		String[] animals = {"고양이", "사슴", "호랑이", "토끼"};
		
		for(int i = 0; i < animals.length; i++) {
			bw.write(animals[i]);
			bw.newLine();
		}
		bw.close();
		
		BufferedReader br = new BufferedReader(new FileReader("animal.txt"));
		
		String line;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		//제대로 출력되지 않는 이유 : 파일의 내용이 두번씩 읽혀지고 그 중 한번은 출력되지 않기 때문
		//br.readLine()
//		while(br.readLine() != null) {
//			System.out.println(br.readLine());
//		}
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());

	}
}














