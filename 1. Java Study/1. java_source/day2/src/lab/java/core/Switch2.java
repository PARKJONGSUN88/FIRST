package lab.java.core;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
		System.out.print("1~100������ ������ �Է��ϼ���:");
		Scanner input = new Scanner(System.in);
		int jumsu= input.nextInt();
		 
		switch(jumsu/10) {
		case 10:
		case 9:
			System.out.println(jumsu+"�� A"); break;
		case 8:
			System.out.println(jumsu+"�� B"); break;		
		case 7:
			System.out.println(jumsu+"�� C"); break;
		case 6:
			System.out.println(jumsu+"�� D"); break;
		default:
			System.out.println(jumsu+"�� F");
		}		

	}

}





