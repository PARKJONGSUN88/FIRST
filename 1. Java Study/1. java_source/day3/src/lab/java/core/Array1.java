package lab.java.core;

public class Array1 {

	public static void main(String[] args) {
		int[] score = new int[5];//����, ����, ������ default������ �ʱ�ȭ		
		System.out.println("score�迭�� ��� ���� :"+score.length);
		
		for(int i=0;i<score.length;i++) {
			System.out.println("score["+i+"]="+score[i]);
		}	
		
		//�迭 ����, ����, ����� �ʱ�ȭ
		int[] score2 =new int[] {100,300,500,700,900,901,902};
		System.out.println("score2�迭�� ��� ���� :"+score2.length);
		for(int num : score2) {
			System.out.println(num);
		}
		
		//�迭 ����, ����, ����� �ʱ�ȭ
		int[] score3 = {100,300,500};
		System.out.println("score3�迭�� ��� ���� :"+score3.length);
		for(int num : score3) {
			System.out.println(num);
		}
		

	}//main end
}//class end







