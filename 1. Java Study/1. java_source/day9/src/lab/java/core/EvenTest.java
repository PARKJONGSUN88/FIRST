package lab.java.core;

public class EvenTest {

	public static void main(String[] args) {
		System.out.println("main start");
		int num = -1;
		try {
		    num = Integer.parseInt(args[0]);
		    System.out.println("other statement processing...");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭���� ���� ó��");
		}catch(NumberFormatException e) {
			System.out.println("���� ���İ��� ���� ó��");
		}catch(Exception e) {
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}finally {
			System.out.println("resource ����");
		}
		if(num%2==0 && num>0) {
			System.out.println(args[0]+"�� ¦��");
		}else if(num%2==1 && num>0){
			System.out.println(args[0]+"�� Ȧ��");
		}
		
		System.out.println("main end");
	}

}
