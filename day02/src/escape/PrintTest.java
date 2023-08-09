package escape;

public class PrintTest {
	public static void main(String[] args) {
		System.out.println("---------print()---------");
		System.out.print("오늘은 2일차 수업\n");
		System.out.print("오늘은 날씨가 맑다\n");
		System.out.print("2023년 5월 19일");
		System.out.println();
		
		System.out.println("\n---------printf()---------");
		//%d, %f, %c, %s
		System.out.printf("오늘은 %d일차 수업\n", 2);
		System.out.printf("오늘은 날씨가 %s", "맑다\n");
		System.out.printf("%d년 %d월 %d일\n", 2023, 5, 19);
		System.out.println("원주율은 3.14다");
		System.out.printf("원주율은 %.2f다\n", 3.14);
		System.out.printf("내 학점은 %c다\n", 'A');
		System.out.printf("나는 대면수업중이다, %s", true);
		
		System.out.println("\n\n---------서식문자의 옵션---------");
		System.out.println("안녕하세요 500");
		System.out.printf("%10s%d\n", "안녕하세요", 500);
		System.out.printf("%-10s%d\n", "안녕하세요", 500);
		System.out.printf("%-10s%010d\n", "안녕하세요", 500);
		System.out.printf("%-10.2s%010d\n", "안녕하세요", 500);
		System.out.printf("%-10.2s\t\t%010d\n", "안녕하세요", 500);
		System.out.println();
		
	}
}




















