package lab.java.core;

public class Operator {

	public static void main(String[] args) {
		// ���׿����� : +, -(sign ������), (), ++, --, !(not), ~(1�Ǻ���)
        int num = -3;
        System.out.println((-num));
        int a = 5, b = 7;
        System.out.println(++a + ++b);//���� �����ڴ� �ٸ� �����ں��� ���� �����
        System.out.println("a="+a + ", b=" +b);
        System.out.println(a++ + b++);//���� �������� ��� �ٸ� �����Ŀ� ���� �ڵ�� �Ѿ�� ������ ++���� ����
        System.out.println("a="+a + ", b=" +b);
        System.out.println(!false);
        //System.out.println(!num);
        System.out.println(~num);
	}

}
