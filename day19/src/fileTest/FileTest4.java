package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest4 {
	public static void main(String[] args) {
		//기존 내용을 덮어쓴다
		try {
//			BufferedWriter bw = new BufferedWriter(new FileWriter("test2.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("test2.txt", true));
			//1. 줄바꿈을 하고 싶으면 \n을 사용한다
			bw.write("\n완료");
			//2. 줄바꿈을 하고 싶으면 newLine()을 사용한다
			bw.newLine();
			//newLine()은 운영체제에 맞는 줄바꿈이 일어난다 -> window : \r\n
			bw.write("진짜 끝");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			BufferedReader br = new BufferedReader(new FileReader("test2.txt"));
			String line;
			//기본적으로 readLine() 한줄씩 가져오지만 개행문자\n을 가져오지 않음
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}











