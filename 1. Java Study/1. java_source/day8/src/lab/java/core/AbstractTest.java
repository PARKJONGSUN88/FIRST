package lab.java.core;

abstract class Animal {
	public abstract void move();
	public abstract void eat();
	public void sleep() {
		System.out.println("zzZZ....");
	}
}

class   Dog  extends Animal{
	public void move() {
		System.out.println("������");
	}
	public void eat() {
		System.out.println("��ļ�");
	}
}
public class AbstractTest {

	public static void main(String[] args) {
		//Animal  animal = new Animal();
		Dog dog = new Dog();
		Animal animal = new Dog();
		animal.eat();
		animal.move();
		animal.sleep();

	}

}
