package lab.java.core;

import java.util.Scanner;

public class Switch1 {
	public static void main(String[] args) {
		System.out.print("1~100������ ������ �Է��ϼ���:");
		Scanner input = new Scanner(System.in);
		int num= input.nextInt();
		 
		switch(num%2) {
		case 0:
			System.out.println(num+"�� ¦��"); break;
		case 1:
			System.out.println(num+"�� Ȧ��");
		}		

	}

}





