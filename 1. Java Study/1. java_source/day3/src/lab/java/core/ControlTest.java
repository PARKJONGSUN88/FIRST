package lab.java.core;

public class ControlTest {

	public static void main(String[] args) {
		a1:
		for(int i=0;i<3;i++) {
			a2:
			for(int j=0;j<3;j++) {
				//if(j==1) continue;
				if(j==1) break a1;  //���� ����� �ݺ��� Ż��
				System.out.println("i="+i+", j="+j);
			}
		}
       //continue�� �̿��ؼ� 1~10������ ¦���� ����մϴ�.
	   int num = 0;
	   while(num<10) {
		   num++;
		   if(num%2==1) continue;
		   System.out.println(num);		   
	   }
	}

}
