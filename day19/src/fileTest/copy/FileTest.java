package fileTest.copy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
		File f = new File("test.txt");
		f.createNewFile();
		System.out.println("test1.txt 파일 생성");
		
		System.out.println(f.exists());
		
		FileOutputStream fos = new FileOutputStream(f);
		
		fos.write('a');
		
	}

}
