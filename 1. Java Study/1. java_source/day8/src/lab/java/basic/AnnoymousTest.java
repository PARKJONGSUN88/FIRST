package lab.java.basic;

public class AnnoymousTest {

	public static void main(String[] args) {
		//public class Bird implements Animal ���� ����
		//������ ���ÿ� ������ �Ǵ� Ŭ����
		Animal bird = new Animal() {//�͸�Ŭ���� ����
			@Override
			public void move() {
				System.out.println("Flying");				
			}			
			public void eat() {
				System.out.println("����");
			}			
		};//�͸�Ŭ���� ��
		bird.move();
		//bird.eat();
		 

}
