package lab.java.core;

class Parent2 {
   int num = 1;
   public void method() {
	   System.out.println("Parent2.method() called");
   }
   public void parentMethod() {
	   System.out.println("Parent2.parentMethod() called");
   }
}

class Child2 extends Parent2{
   int num = 2;
   public void method() {
	   System.out.println("Child2.method() called");
   }
   public void childMethod() {
	   System.out.println("Child2.childMethod() called");
   }
}


public class ExtendsTest2 {
	public static void main(String[] args) {
		Parent2 p = new Parent2();
		System.out.println(p.num);
		p.method();
		p.parentMethod();
//�θ�� ����ǰ�, ������ ��ü�� �ڽ�Ŭ������ �޼��� ȣ�� �Ұ�
		//p.childMethod(); 
		
		Child2  c = new Child2();
		System.out.println(c.num);
		c.method();
		c.parentMethod();
		c.childMethod(); 
		
		Parent2 p2 = new Child2();//������ ��ü
		System.out.println(p2.num);//����� �θ��� ��������� �켱������ ����
		p2.method();
		p2.parentMethod();
		//p2.childMethod(); 
		((Child2)p2).parentMethod();
		System.out.println(((Child2)p2).num);
	}

}






