package com.workshop5.test;

import com.workshop5.biz.CustomerBiz;
import com.workshop5.biz.ICustomerBiz;
import com.workshop5.entity.Customer;
import com.workshop5.util.CustomerUtil;
 

public class CustomerTest {
	public static void main(String[] args) {
		ICustomerBiz  biz = new CustomerBiz();
		biz.initializeCustomer();
		int menu = 0;
		while(true) {
			printMenu();
			System.out.print("## �޴� �Է�:");
			try {
			     menu = Integer.parseInt(CustomerUtil.getUserInput());
			}catch(NumberFormatException e) {
				System.out.println("[����] �޴��� ���ڸ� �Է��ؾ� �մϴ�.");
				continue;
			}
			if (menu==9) {
				System.out.println("-------------------------------");
				System.out.println("���α׷��� �����մϴ�. Bye~ ");
				System.out.println("-------------------------------");
				break;
			}
			switch(menu) {
			case 1 : biz.printAllCustomer(); ; break;
			case 2:
				System.out.println("-------------------------------");
				System.out.println("���ο� �� ������ �߰��մϴ�.");
				System.out.println("���ο� ���� ������ �Է��ϼ���");
				System.out.println("-------------------------------");
				System.out.print(">�̸�:");
				String name= CustomerUtil.getUserInput();
				System.out.print("����:");
				int age = Integer.parseInt(CustomerUtil.getUserInput());
				System.out.print(">��ȭ��ȣ:");
				String phone= CustomerUtil.getUserInput();
				Customer cust = new Customer(name, age, phone);
				biz.insertCustomer(cust);
				System.out.println("@ �� ������ �߰��Ͽ����ϴ�");
                break;
			case 3 : biz.deleteCustomer(); break;
			default: System.out.println("[����]�޴��� �߸� �Է��Ͽ����ϴ�.");
			}
			 
		}
	}
	
	public static void printMenu() {
		System.out.println("===== <<�� ���� ���α׷�>> ======");
    	System.out.println("1. ��ü �� ���� ��ȸ");
    	System.out.println("2. �� ���� �߰�");
    	System.out.println("3. �� ���� ����");
    	System.out.println("9. �ý��� ����");
    	System.out.println("=======================");
	}
}
