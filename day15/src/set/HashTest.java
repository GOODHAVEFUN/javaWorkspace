package set;

import java.util.HashSet;

public class HashTest {
	public static void main(String[] args) {

		HashSet<Student> set = new HashSet<>();
		Student st1 = new Student(1, "홍길동");
		Student st2 = new Student(2, "홍길동");
		Student st3 = new Student(1, "홍길동");
		
		set.add(st1);
		set.add(st2);
		set.add(st3);
		set.add(new Student(3, "홍길동"));
		set.add(new Student(1, "짱구"));
		System.out.println(set.size());
		
	}
}













