package lab.java.core;

public class Test {   //Test this = new Test();
    private int num;
    public void setNum(int num) {//���ú���
        //�޼ҵ带 ȣ���� ��ü �ڽ��� �Ӽ� num�� �����ϱ� ���ؼ��� 
    	//��� ��ü�� �����ɶ� �ڱ��ڽ��� �����ϴ� reference���� �ڵ� �����˴ϴ�.
     	this.num = num;
    }
    public int getNum() {
    	return num;
    }
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.getNum());//?0
		t.setNum(100);
		System.out.println(t.getNum());//?100
		
	}

}
