package lab.java.core;

import java.util.Scanner;

public class Switch3 {
	public static void main(String[] args) {
		System.out.print("���� ���ڸ� �Է��ϼ���:");
		Scanner input = new Scanner(System.in);
		String word = input.next();
		 
		switch(word) {
		case "A":
		case "a":
			System.out.println("Angel"); break;
		case "B":
		case "b":
			System.out.println("Brown"); break;		
		case "C":
		case "c":
			System.out.println("Camel"); break;		
		default:
			System.out.println("�غ����Դϴ�.");
		}		

	}

}





