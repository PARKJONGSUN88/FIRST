package lab.java.core;

import java.util.Scanner;

public class If5 {
	public static void main(String[] args) {
		System.out.print("�⵵�� �Է��ϼ���:");
		Scanner input = new Scanner(System.in);
		int year= input.nextInt();
		 
		if(year%4==0) {			 
		    if(year%400==0) {
			   System.out.println(year+"�� ����");
		    }else if(year%100==0) {
		       System.out.println(year+ "�� ���");
		    }else {
		       System.out.println(year+ "�� ����");
		    }
		}else {
			System.out.println(year+"�� ���");
		} 
		System.out.println("���2");
		if(year%4==0 && year%400==0 ) {			
			System.out.println(year+"�� ����");
		}else if(year%4==0 && year%100==0 ) {			
			System.out.println(year+"�� ���");
		}else if(year%4==0){
			System.out.println(year+"�� ����");
		}else {
			System.out.println(year+"�� ���");
		}

	}//main end
}//class end









