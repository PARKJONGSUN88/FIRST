package exercise.class2.BaseBall;

public class BaseBallTest {

	public static void main(String[] args) {
		a1:
		for (BaseBall.player=0;  ;BaseBall.player++) {
			System.out.println("***** "+ ++BaseBall.player+ "��° ���� ��� ****");
		   b1:
			while(true) {			
			if(BaseBall.outCount==3) {
				System.out.println("�����ƿ�! ������ü");
				break a1;
			}		
			 
			if(BaseBall.isStrike()) {
				System.out.println("�� ���� => ��!!");
				++BaseBall.ball;
				BaseBall.getStatus();
				if(BaseBall.ball==4) {
					System.out.println("\n1�� ���");	
					break b1;
				}
			}else {
				System.out.println("�� ���� => ��ũ����ũ!!");
				++BaseBall.strike;	
				BaseBall.getStatus();
				if(BaseBall.strike==3) {
					System.out.println("\n"+ ++BaseBall.outCount +"�ƿ�");
					System.out.println("���� ��ü");	
					break b1;
				}
			}		
			
		}//while end
	  }//for end
	}//main end

}
