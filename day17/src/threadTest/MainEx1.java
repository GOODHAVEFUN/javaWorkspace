package threadTest;

import javax.swing.JOptionPane;

public class MainEx1 {
	public static void main(String[] args) {
		ThreadEx te = new ThreadEx();
		Thread t1 = new Thread(te);
		String[] btn = {"-1", "종료"};
		
		int choice = 0;
		t1.start();
		
		while(true) {
			choice = JOptionPane.showOptionDialog(null, 
					"", "숫자놀이",
					JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, btn, null);

			if(choice == 0) {
				te.user();
			}else {
				t1.interrupt();
				break;
			}
		}
	}
}
