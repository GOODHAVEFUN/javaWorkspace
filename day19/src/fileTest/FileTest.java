package fileTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
		
		File f = new File("test1.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("test1.txt 파일이 생성되었습니다");
		
//		f.delete();
		System.out.println(f.exists());
		
		try {
			FileOutputStream fos = new FileOutputStream(f);
			fos.write('a');
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}










