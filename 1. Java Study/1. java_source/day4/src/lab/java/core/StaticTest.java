package lab.java.core;

public class StaticTest {
	public static int snum = 5;   //1 ���� �ʱ�ȭ               
	static {   //Static Initialize Block�� main���� ���� ����, �ٸ� ��ü�������� ���� ����
		snum += 5;
	}//2

	public static void main(String[] args) {
		System.out.println(snum);// ?
		snum /= 4;
		System.out.println(snum);// ?
	}

	static { //�޸𸮿� �ʱ�ȭ�ؾ��� �ڵ� ����(��) ���̺귯�� �ε�, 
		snum *= 5;
	}//3

}
