package lab.java.core;

import java.util.Scanner;

public class JuminCheck {

	public static void main(String[] args) {
		System.out.print("�ֹι�ȣ �Է�(��:123456-7891234):");
		Scanner input = new Scanner(System.in);
		String juminStr = input.next();

		int[] jumin = new int[13];
		// �Է¹��� �ֹι�ȣ ���ڸ� - �����ϰ� �迭�� �����մϴ�.
		for (int i = 0, j = 0; i < juminStr.length(); i++) {
			if (i == 6)
				continue;
			jumin[j++] = juminStr.charAt(i) - 48; // juminStr.charAt(i)-'0'
		}
		
		int digit =2, hap = 0;
		for (int i = 0, j = 0; i < jumin.length-1; i++, digit++) {
			if (digit == 10) digit =2;			
			hap += jumin[i]* digit;
		}
		
		//System.out.println(hap);		 
		int result=(11-(hap%11))%10;
		if(result==jumin[12]) {
			System.out.println("�ùٸ� �ֹε�Ϲ�ȣ�Դϴ�.");
		}else {
			System.out.println("�߸��� �ֹε�Ϲ�ȣ�Դϴ�.");
		}		

		if (jumin[6] == 9 || jumin[6] == 1 || jumin[6] == 3) {
			System.out.println("����� ������ �����Դϴ�.");
		} else if (jumin[6] == 0 || jumin[6] == 2 || jumin[6] == 4) {
			System.out.println("����� ������ �����Դϴ�.");
		}
		if (jumin[6] == 3 || jumin[6] == 4 ) {
			System.out.println("����� 2000��� ������Դϴ�.");
		} else if (jumin[6] == 2 || jumin[6] == 1) {
			System.out.println("����� 1900��� ������Դϴ�.");
		}

	}// main end

}// class end
