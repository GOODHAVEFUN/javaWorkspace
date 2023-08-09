package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
	public static void main(String[] args) {
		

	int[] ar = {2, 3, 4, 5, 2, 3, 4, 5, 1, 1, 1};
	//ar 배열을 List<Integer>로 변환해서 list변수에 저장하기
	List<Integer> list = Arrays.stream(ar).boxed().collect(Collectors.toList());
	System.out.println(list);
	
	//ar배열의 중복값을 업애고 int[] 타입으로 변환해서 저장하기
	int[] ar2 = list.stream().distinct().mapToInt(i -> i).toArray();
	System.out.println(Arrays.toString(ar2));
	
	//위에서 만든 List의 중복값을 없애고, int[]로 변환해서, ar2변수에 저장하기
	int[] ar3 = list.stream().distinct().mapToInt(i -> i).toArray();
	System.out.println(Arrays.toString(ar2));
	
	//ar 배열의 중복값을 처리하고, 각요소에 10을 더하고, 정렬하여 출력하기
	Arrays.stream(ar).distinct().map(i -> i+10).sorted().forEach(System.out::println);
	
	}
}
















