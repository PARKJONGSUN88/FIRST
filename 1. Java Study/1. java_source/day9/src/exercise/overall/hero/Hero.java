package exercise.overall.hero;

public abstract class Hero implements CanFly, CanFight, CanSwim {

	@Override
	public void swim() {
		System.out.println(this+"�� ���ģ��.");
	}

	@Override
	public void fight() {
		System.out.println(this+"�� �ο��.");
	}

	@Override
	public void fly() {
		System.out.println(this+"�� ����.");
	}
	protected abstract void action();

}
