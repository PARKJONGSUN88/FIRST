package lab.java.core;

public class PolyTest {
    public void method(Object o ) {
    	System.out.println(o.toString());
    	if(o instanceof String) {
    	    System.out.println("length:"+((String)o).length());
    	}
    	if(o instanceof Integer) {
    		 System.out.println("intValue :"+ ((Integer)o).intValue());
    	}    	
    }
	public static void main(String[] args) {
		PolyTest test = new PolyTest();
		Object o = new Object();
		test.method(o);
		System.out.println();
		String s = new String("java");		 
		test.method(s);//�Ķ���� ���޽� �θ� Ÿ������ UpCasting�˴ϴ�.
		System.out.println();
		Integer integer = new Integer(100);	 
		test.method(integer);
		//UpCasting���� ���޹��� �Ķ���͸� ���� ��ü�� DownCasting�����մϴ�.
		
		Object[] obj = {
				new String("korea"),
				new Integer("100"),
				new Parent(),				
				new Double("0.5")
		};
		System.out.println(((String)obj[0]).substring(1,3));
		for(Object ob : obj) {
			System.out.println(ob.getClass());
		}
		
		lab.java.basic.Animal cat =new lab.java.basic.Cat();

	}
	
	
	
	

}
