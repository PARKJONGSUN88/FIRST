package lab.java.core;

import java.util.Scanner;

public class If2 {
	public static void main(String[] args) {
		System.out.print("�ѹ��ڸ� �Է��ϼ���:");
		Scanner input = new Scanner(System.in);
		String st = input.next();
		char ch = st.charAt(0);
		
		if(ch>47 && ch<58) {
			System.out.println(st+"�� �����Դϴ�.");
		}else if(ch>64 && ch<91) {
			System.out.println(st+"�� �����빮���Դϴ�.");
		}else if(ch>96 && ch<123) {
			System.out.println(st+"�� �����ҹ����Դϴ�.");
		}		

	}

}





