//package synchronization;
//
//import javax.swing.JOptionPane;
//
//public class ThreadTest {
//
//    public static void main(String[] args) {
//        // 사용자입력
//        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
//        System.out.println("입력 값은 " + input + " 입니다.");
//
//        // 카운트다운
//        for (int i = 10; i > 0; i--) {
//            System.out.println(i);
//
//            try {
//                Thread.sleep(1000);
//            } catch (Exception e) { }
//        }
//
//    }
//}
