package com.workshop2.account;

import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {
		Account  sj = new Account("CUST01", "������", "1-22-333", 100000);
		int amount = 0;
		int menu =0;	
		sj.printAccount();
		while((menu =getMenuItem())!=9) {
		switch(menu) {
		case 1 : 
			System.out.print("�ݾ� : ");		
		    amount = getAmount();
		    sj.addBalance(amount);
		    System.out.println(amount+"���� �Ա��߽��ϴ�."); 
		    System.out.println("==================");
		    System.out.println("���� �ܾ�:"+sj.getBalance());
		    System.out.println("==================");
		    break;
		case 2 :
			System.out.print("�ݾ� : ");		
		    amount = getAmount();
		    sj.subtractBalance(amount);
		    System.out.println(amount+"���� ����߽��ϴ�."); 
		    System.out.println("==================");
		    System.out.println("���� �ܾ�:"+sj.getBalance());
		    System.out.println("==================");
		    break;
		}//switch end
		} //while end
		System.out.println("Bye~~~");
	}//main end
	
	/* �ݾ��� �Է� �޽��ϴ�. */
	public static int getAmount() {
		//static �޼ҵ忡���� non-static ����, ��ü, �޼ҵ� ��� �Ұ�
	    return getUserInput();  
	}
	
	/*�޴� ��ȣ �Ǵ� �ݾ� �Է� �޽��ϴ�.*/
	public static int getUserInput() {
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
	/* �޴� ����ϰ� �޴� �Է� �ޱ� */
	public static int getMenuItem() {
		System.out.println("[ Menu ]");
		System.out.println("1.�Ա�");
		System.out.println("2.���");
		System.out.println("3.����");
		System.out.print("==>Menu���� :");
		return getUserInput();		
	}
	

}





