package lab.java.core;

public class TvTest {

	public static void main(String[] args) {
		 Tv t =new Tv(); //��ü ����
		 System.out.println(t.color); //�Ӽ��� ����
		 System.out.println(t.power);
		 System.out.println(t.channel);
		 t.power(); //�޼ҵ� ȣ��
		 System.out.println(t.power);//���� ���� Ȯ��
		 t.power(); //�޼ҵ� ȣ��
		 System.out.println(t.power);//���� ���� Ȯ��
		 t.channel = 3;
		 System.out.println(t.channel);
		 t.channelUp();
		 System.out.println(t.channel);
	}

}
