package lab.java.core;

public class While1 {

	public static void main(String[] args) {
		int count =0;		
		while(count<10){
		  System.out.print(++count +" ");
		}
		System.out.println();
		//1. 1~10���� ���� ��
		count =0;  //�ٽ� 0���� �ʱ�ȭ
		int hap = 0;  //�������� ������ ���� ����� �ʱ�ȭ
		while(count<10){
		  hap +=++count;
		}
		System.out.println("1~10������ �������� "+hap);
		//2. 1~10������ Ȧ���� ���
		count =0;  //�ٽ� 0���� �ʱ�ȭ
		while(count<10){
		   if(++count%2==1) System.out.println(count);
		}
		System.out.println();
		//3. 1~10������ Ȧ���� �������� ���
		while(count>0){
			   if(count%2==1) System.out.println(count);
			   count--;
			}

	}

}






