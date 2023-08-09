package array;

public class TwoForEach {
	public static void main(String[] args) {
		
		int[][] ar = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
		int total = 0;
		for(int[] row : ar) {
			System.out.println(row);
			for(int element : row) {
				System.out.println(element);
				total += element;
			}
		}
		System.out.println(total);
		
//		System.out.println(ar[0][0] + ar[0][1] + ar[0][2]);
	}
}
