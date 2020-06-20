package lab.java.core;

public class MethodTest {
	int member = 0;
	MethodTest(){
	   System.out.println ("MethodTest() called");
	}
    MethodTest(int a){
    	this();    
    	System.out.println ("MethodTest(int) called");    	
	}
	
    public int method1() {
    	int local = 1;
    	return local;
    }
    public void method2(int member) {
    	System.out.println(method1()); 
    	System.out.println(member);
    	//Ŭ���� ���ο��� �ڽ��� ��ü �������� �ʰ� this�� ����մϴ�.
    	//this�� ��ü �����ɶ� �ڽ��� �����ϴ� reference�����Դϴ�.
    	System.out.println(this.member);
    	//�޼��峻�� ����� local������ �޸𸮿� �޼��尡 ȣ��ɶ� �����ǰ�,
    	//�޼��� ������ ����Ǹ� GC�ǹǷ�, local������ �޼��� �ܺο��� ���� �Ұ��մϴ�.
    	System.out.println(this.method1()); 
    	//Ŭ���� ���ο��� ����鰣�� �޼��� ȣ���� ��ü �������� ȣ�� ����
    	
    }
	public static void main(String[] args) {
		MethodTest  test = new MethodTest (3);
		test.method2(100);
	}

}


