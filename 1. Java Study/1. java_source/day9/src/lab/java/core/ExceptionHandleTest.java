package lab.java.core;

public class ExceptionHandleTest {
    
	public void checkTall(double tall) throws AbnormalValueException {
		//���л� Ű ������ 140�̻� 180���� ���θ� üũ�ؼ�
		//������ �ƴϸ鿹�ܸ� �����ϴ�
		if(tall<140) throw new AbnormalValueException("140���� �۽��ϴ�");
		if(tall>180) throw new AbnormalValueException("180���� Ů�ϴ�");
	}
	
	public static void main(String[] args) {
		double[] talls = new double[] { 155.5,163.2,170.4,149.5,
				128,168,189.5,166,172,169,158,173};
		ExceptionHandleTest  test = new ExceptionHandleTest();
        //Ű���� ������ üũ�ؼ�
		//���� �߻��ϸ� ����ó���մϴ�. => �۳⵵ Ű ��հ����� �����մϴ�.
		//������ ���л� ��� Ű���� ����մϴ�.
		for(int i=0;i<talls.length;i++) {
			try {
			     test.checkTall(talls[i]);
			}catch(AbnormalValueException e) {
				System.out.println(e.getMessage()+", �۳⵵ Ű������ �����մϴ�.");
				talls[i] = e.getOldTall();				
			}
		}
		double hap = 0.0;
		for(double tall : talls)
			hap += tall;
		System.out.println("���� ���л� ��� Ű�� "+(hap/talls.length)+"cm�Դϴ�.");
		
		}//main end

}//class 

 