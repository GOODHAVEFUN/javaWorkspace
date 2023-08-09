package review01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
//		Thread t1 = new Thread(new ThreadTask(), "A");
//		t1.start();

		Thread[] arThread = new Thread[3];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 : ");
		for(int i = 0; i < arThread.length; i++) {
			String temp = sc.next();
			arThread[i] = new Thread(new ThreadTask(), temp);
		}
		
		for(int i=0; i < arThread.length; i++) {
			arThread[i].start();
			try {
				arThread[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}











