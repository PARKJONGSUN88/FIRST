package com.workshop1.one;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		while(true) {
			System.out.print("���ڸ� �Է��ϼ���(����:0):");
			int num = getUserInput();
			if(num==0) {
				System.out.println("Bye~~");
				break;
			}
			if(num==1) {
				System.out.println(num+"�� �Ҽ��� �ƴմϴ�.");	
				continue;
			}
			if(num==2) {
				System.out.println(num+"�� �Ҽ� �Դϴ�.");	
				continue;
			}
			for(int i=2;i<num;i++) {
				if(num%i==0 ) {					 
					System.out.println(num+"�� �Ҽ��� �ƴմϴ�.");
					break;
				} 	
				System.out.println(num+"�� �Ҽ� �Դϴ�.");
				break;
			}			 
			
		}
		
	}
	public static int getUserInput() {
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}

}
