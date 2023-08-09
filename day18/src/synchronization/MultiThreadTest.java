//package synchronization;
//import javax.swing.JOptionPane;
//public class MultiThreadTest {
//	    public static void main(String[] args) {
//	        Thread t = new Thread(new MyThread());
//	        t.start();
//
//	        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
//	        System.out.println("입력 값은 " + input + " 입니다.");
//
//	    }
//
//	}
//
//	class MyThread implements Runnable {
//
//	    @Override
//	    public void run() {
//	        for (int i = 10; i > 0; i--) {
//	            System.out.println(i);
//
//	            try {
//	                Thread.sleep(1000);
//	            } catch (Exception e) { }
//	        }
//	   }
//}
