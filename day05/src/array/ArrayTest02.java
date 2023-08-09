package array;

public class ArrayTest02 {
	public static void main(String[] args) {
		//어떤 값을 넣을 지 알 때
		int[] ar1 = {1, 2, 3, 4, 5};
		//    참조변수 	참조값
		System.out.println(ar1); //주소값(참조값)
		System.out.println(ar1[0]);
		System.out.println(ar1[0] + 10);
		
		//저장공간, 값으로 사용되는 경우 구분을 잘해야된다!
		ar1[1] = ar1[2] + ar1[3];
		System.out.println(ar1[1]);
		
		//몇 칸 만들지 알 때
		char[] ar2 = new char[4];
//		System.out.println(ar2);
		ar2[0] = 'a';
		ar2[1] = 'b';
		ar2[2] = 'c';
		ar2[3] = 'd';
		
		System.out.println(ar2[3]);
		
		int[] ar3 = null; //null 주소의 초기값
		System.out.println(ar3);
		
		String name = ""; //"" 빈 문자열
		System.out.println(name);
		String name2 = null;
		System.out.println(name);
		
	}
}













