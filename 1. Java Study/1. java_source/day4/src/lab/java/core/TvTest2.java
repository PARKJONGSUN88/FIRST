package lab.java.core;

public class TvTest2 {

	public static void main(String[] args) {
		 Tv t =new Tv(); //��ü ����
		 System.out.println(t);
		 t.channel = 7;
		 Tv t2 =new Tv(); //��ü ����
		 System.out.println(t2); 
		 t2.channel = 16;
		 //�ν��Ͻ� ������ ���� ������ ��ü������ �ٸ� ���� ���� �� �ֽ��ϴ�.
		 System.out.println(t.channel);
		 System.out.println(t2.channel);
		 
		 t2.channel = t.channel;
		 System.out.println(t.channel);
		 System.out.println(t2.channel);
		 
		 Tv t3 = t;
		 System.out.println(t );
		 System.out.println(t3);
		 t.channel = 10;
		 System.out.println(t.channel);
		 System.out.println(t3.channel);
		 
		 
	}

}
