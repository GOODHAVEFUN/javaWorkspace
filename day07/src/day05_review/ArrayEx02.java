package day05_review;

public class ArrayEx02 {
	public static void main(String[] args) {
		//2. A~F까지 중 C 제외하고 배열에 담고 출력
//		char[] ar = {'A', 'B', 'D', 'E', 'F'};
		char[] ar = new char[5];
		int temp = 0;
		for(int i = 0; i < ar.length; i++) {
			temp = i;
			if(temp > 1) {
				temp++;
			}
			ar[i] = (char)(temp+65);
		}
		
		for(char data : ar) {
			System.out.println(data);
		}
		
	}
}
