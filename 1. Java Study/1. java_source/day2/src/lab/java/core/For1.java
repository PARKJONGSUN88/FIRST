package lab.java.core;

public class For1 {

	public static void main(String[] args) {
		/*
		for(int i=1;i<=10;i++){
			   System.out.println(i);
		}
		*/
		//1. 1~10���� ���� ��
		int hap = 0;
		for(int i=1;i<=10;i++){
		   hap+=i;
		}
		 System.out.println("1~10 �������� "+hap);
		
		//2. 1~10������ Ȧ���� ���
		 for(int i=1;i<=10;i++){
			if(i%2==1) System.out.print(i+",");
		 } 
		 System.out.println();
		//3. 1~10������ Ȧ���� �������� ���
		 for(int i=10;i>0;i--){
				if(i%2==1) System.out.print(i+",");
			 }
		 System.out.println();
		//4. A~Z���� ���
		 for(char ch = 'A';ch<='Z';ch++) {
			 System.out.print(ch+" ");
		 }
		 System.out.println();
		//5. A~Z���� �������� ���
		 for(char ch = 'Z';ch>='A';ch--) {
			 System.out.print(ch+" ");
		 }
		 System.out.println(); 

	}

}
