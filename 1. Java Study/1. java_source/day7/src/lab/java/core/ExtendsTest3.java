package lab.java.core;

class Parent3 {
    int age = 55;    
}

class Child3 extends Parent3{ //���
	int age = 26;
	public void printAge() {
		int age = 23;
		System.out.println(age);//���� ����� ����(scope)���� �˻�
		System.out.println(this.age);//�޼����� ����� �Ӽ��� �б�
		System.out.println(super.age); //��ӹ��� �Ӽ��� �б�
		//�ڽİ�ü�� �����ɶ� �θ� �����ϴ� ������ �ڵ� ���� : super
	}
}

public class ExtendsTest3 {
	public static void main(String[] args) {
		  Child3 c = new Child3();
		  c.printAge();
	}
}

