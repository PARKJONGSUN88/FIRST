package lab.java.core;

import java.io.IOException;

public class ThrowsTest {
    public void methodA() throws IOException {
    	methodB();
    	System.out.println("methodA processed");
    }
    public void methodB() throws IOException {
    	methodC();
    	System.out.println("methodB processed");
    }
    public void methodC() throws IOException{
    	//processing �ڵ�....
    	//if(Ư������üũ) �� �̻� processing�� ����� �����̶�
    	//���ܸ� ������ ȣ���� �ʿ� �޽����� �༭ ����ó�ϵ��� �Ϸ���
    	if(true) throw  new IOException("����������....");
    	System.out.println("methodC processed");
    }
	public static void main(String[] args) throws IOException {
		ThrowsTest test = new ThrowsTest();
		test.methodA();

	}

}
