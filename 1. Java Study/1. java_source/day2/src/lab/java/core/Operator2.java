package lab.java.core;

public class Operator2 {

	public static void main(String[] args) {
		// shift������ (<<, >>, >>>)
        int a = 3;
        //<<�������� ��Ʈ�� �̵���Ű��, ������ ��Ʈ�� 0���� ä��ϴ�.
        // X<<Y�� X*2^Y�� ����� �����ϴ�.
        System.out.println(a<<5);
        int b = 256;
        //>>�� ���������� ��Ʈ�� �̵���Ű��, ���ʺ�Ʈ�� sign��Ʈ�� ä��ϴ�.
        //X>>Y�� X/2^Y�� ����� �����ϴ�.
        System.out.println(b>>3);
        System.out.println(-b>>3);
        
      //>>>�� ���������� ��Ʈ�� �̵���Ű��, ���ʺ�Ʈ�� ������ 0�� ä��ϴ�.
      //����� �׻� ���
        System.out.println(b>>>3);
        System.out.println(-b>>>3);
        
        //b = b+4;
        b+=4;
        System.out.println(b);
        
        
        
	}

}






