package exercise.inheritance;

public class LanguageTest {

	public static void main(String[] args) {
/*������ ��ü -��Ӱ��谡 �ִ� ��� �θ�� Ÿ���� �����ϰ�
		 ������ �ڽ�Ŭ����Ÿ������ ���� 
�θ�� �ڽĿ� ������ �Ӽ��� ������ �� �θ� �켱�� access�մϴ�.
�θ� ����Ǿ� ���� ���� ������ ��ü ĳ������ �ؾ� ���� �����մϴ�.
�θ��� �޼��带 �ڽ�Ŭ�������� override�� ���, �޼��带 ȣ���ϸ� 
�ڽ�Ŭ������ override�޼��尡 �����ϸ� �ڽ� Ŭ������ �޼��带 �켱������ 
ȣ���մϴ�.
�θ� ����Ǿ� ���� ���� �޼���� ��ü ĳ������ �ؾ� ȣ�Ⱑ���մϴ�.
	 */
		Language k = new Korean();
		System.out.println(k.region);
		Language e = new English();
		System.out.println(e.region);
		Language j = new Japanese();
		System.out.println(j.region);
		k.sayHello();
		e.sayHello();
		j.sayHello();

	}

}
