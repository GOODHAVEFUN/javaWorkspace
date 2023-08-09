package fileTest.copy;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest2 {
	public static void main(String[] args) throws IOException {
		//2바이트 문자 단위로 데이터를 스트림으로 전송
		FileWriter fw = new FileWriter(new File("test2.txt"));
		fw.write('h');
		fw.write('i');
		fw.write("hello");
		//문자열을 입력하면 알아서 문자 단위로  끊어준다
		
		fw.close();
		
		FileReader fr = new FileReader(new File("test2.txt"));
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
	}
}
