package fileTest.copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {
	public static void main(String[] args) {
		// animal.txt 파일 생성하고 연다
		// 동물이름을 담고있는 animals 배열을 생성한다{"","","",""} 등을 4개이상
		// animals 배열의 각 요소를 파일에 줄바꿈하면서 쓴다
		// 파일의 각 줄을 읽어와서 출력한다
		String[] animals = { "앵무새", "강아지", "고양이", "판다" };

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("animal.txt")));
			for (int i = 0; i < animals.length; i++) {
				bw.write(animals[i] + "\n");
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			BufferedReader br = new BufferedReader(new FileReader("animal.txt"));
			String line = null;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
