package lab.java.core;

import java.util.Scanner;

public class If3 {
	public static void main(String[] args) {
		System.out.print("1~100������ ������ �Է��ϼ���:");
		Scanner input = new Scanner(System.in);
		int num= input.nextInt();
		 
		if(num%2==0) {
			System.out.println(num+"�� ¦��");
		}else  {
			System.out.println(num+"�� Ȧ��");
		}		

	}

}





