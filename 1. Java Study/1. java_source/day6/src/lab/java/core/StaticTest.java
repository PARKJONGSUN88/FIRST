package lab.java.core;

public class StaticTest {
    static int snum; //Ŭ��������
    int num; //�ν��Ͻ� ����
    
    public static void staticMethod() {
    	snum++; //Ŭ���� ���� ó�� ����
    //	num++;  //�ν��Ϻ��� ó�� �Ұ���
    }
    public void method() {
    	snum++;
    	num++;
    }
	public static void main(String[] args) {
		StaticTest test = new StaticTest();
		test.method();
		staticMethod();
		System.out.println(snum);
		System.out.println(test.num);

	}

}
