package lab.java.core;

import java.util.Scanner;

public class If4 {
	public static void main(String[] args) {
		System.out.print("1~100������ ������ �Է��ϼ���:");
		Scanner input = new Scanner(System.in);
		int jumsu= input.nextInt();
		 
		if(jumsu>89) {
			System.out.println(jumsu+"�� A");
		}else if(jumsu>79) {
			System.out.println(jumsu+"�� B");
		}else if(jumsu>69) {
			System.out.println(jumsu+"�� C");
		}else if(jumsu>59) {
			System.out.println(jumsu+"�� D");
		}else {
			System.out.println(jumsu+"�� F");
		}

	}

}





