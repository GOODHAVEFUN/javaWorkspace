package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListTask {
	public static void main(String[] args) {
		//1~30까지 난수를 만들어 ArrayList에 7개 저장한다
		//중복되는 수는 없도록한다
		//오름차순 정렬
		
		Random r = new Random();
		ArrayList<Integer> al = new ArrayList<>();
		int count = 0;
		
		while(count < 7) {
			int num = r.nextInt(30) + 1;
			//중복되는 수 없도록 메소드 이용
			if(!al.contains(num)) {
				al.add(num);
				count++;
			}
		}
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
	}
}












