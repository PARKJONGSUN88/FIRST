package lab.java.core;

class Parent4 {     
}

class Child4 extends Parent4{ //���	 
}

class Child1 extends Parent4{ //���	 
}
public class ExtendsTest4 {
	public static void main(String[] args) {
		  Child4 c4 = new Child4();
		  Child1 c1 = new Child1();
		  Parent4 p = new Parent4();
		  // ���۷�������(��ü) instanceof Ÿ��(Ŭ������, �������̽���)
		  System.out.println(c4 instanceof Child4); // is a ���� üũ
		  System.out.println(c4 instanceof Parent4); //��� ���� üũ
		  System.out.println(p instanceof Child4); //��� ���� üũ
		  //System.out.println(c1 instanceof Child4); //���� ��� ���� ���� ��� ������ ����
	}
}

