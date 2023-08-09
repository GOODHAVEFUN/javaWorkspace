package array;

public class TwoArray {
	public static void main(String[] args) {
/*		int[][] arr1 = new int[2][3];
		int num = 10;
		for(int i = 0; i < arr1.length; i++) { //행
//			System.out.println(i);
			for(int j = 0; j < arr1[i].length; j++) { //열
//				System.out.println(j);
				arr1[i][j] = num;
				num += 10;
				System.out.println(arr1[i][j] + " ");
			}
		}
*/
		int[][] arr2 = {{10, 20, 30}, {40, 50, 60}};
		for(int i = 0; i < arr2.length; i++) {
			for(int j=0; j < arr2[i].length; j++) {
				System.out.println(arr2[i][j]);
			}
			System.out.println();
		}
		
		//for-each문 => 증감식x, 반복x
		int total = 0;
		for(int[] i : arr2) {
			for(int j : i) {
				total +=j;
				System.out.println(j);
			}
		}
		System.out.println(total);
		
	}
}












