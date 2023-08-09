package review;

import java.util.Scanner;

public class ThreadExample {
    public static void main(String[] args) {
        // 사용자에게 A, B, C를 입력받음
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 쓰레드 이름을 입력하세요: ");
        String threadAName = scanner.nextLine();
        System.out.print("두 번째 쓰레드 이름을 입력하세요: ");
        String threadBName = scanner.nextLine();
        System.out.print("세 번째 쓰레드 이름을 입력하세요: ");
        String threadCName = scanner.nextLine();

        // ThreadTask 객체 생성
        ThreadTask task = new ThreadTask();

        // 각각의 이름으로 스레드 생성 및 실행
        Thread threadA = new Thread(task, threadAName);
        Thread threadB = new Thread(task, threadBName);
        Thread threadC = new Thread(task, threadCName);

        threadA.start();
        threadB.start();
        threadC.start();
    }
}

