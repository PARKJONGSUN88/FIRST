package lab.java.core;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ThreadTest extends Frame{
	Count cnt ;
	Snow snow;
	ThreadTest(){
		setSize(600, 200);
		setLayout(new GridLayout(1,3));
		cnt = new Count();
		add(cnt); //panel ������Ʈ�� frame�� ��ġ
		snow = new Snow();
		add(snow);
		setVisible(true);
		
		
		addWindowListener(new WindowAdapter() {		
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		Thread t = new Thread(cnt);
		t.start();  //������ ���� => �����ٷ� ȣ��
		Thread t2 = new Thread(snow);
		t2.start();  //������ ���� => �����ٷ� ȣ��
	}

	public static void main(String[] args) {
		new ThreadTest();

	}

}
