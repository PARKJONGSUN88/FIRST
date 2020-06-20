package com.workshop6.test;

import com.workshop6.biz.IShoppingBiz;
import com.workshop6.biz.ShoppingBiz;
import com.workshop6.util.CommonUtil;

public class ShoppingTest {

	public static void main(String[] args) {
		IShoppingBiz biz = new ShoppingBiz();
		int menu = 0;
		while(true) {
			printMenu();
			System.out.print("## �޴� �Է�:");
			try {
			     menu = Integer.parseInt(CommonUtil.getUserInput());
			}catch(NumberFormatException e) {
				System.out.println("[����] �޴��� ���ڸ� �Է��ؾ� �մϴ�.");
				continue;
			}
			if (menu==9) {
				System.out.println("���α׷��� �����մϴ�. Bye~ Bye~");
				break;
			}
			switch(menu) {
			case 1 : biz.printAllProducts(); break;
			case 2: biz.printPricePerProduct(); break;
			case 3 : biz.calculateTotalPrice(); break;
			default: System.out.println("[����]�޴��� �߸� �Է��Ͽ����ϴ�.");
			}
			 
		}

	}
    public static void printMenu() {
    	System.out.println("===== << �޴� >> ======");
    	System.out.println("1. ��ٱ��� ��� ���");
    	System.out.println("2. ǰ�� ���� ���");
    	System.out.println("3. �� ���԰��� ���");
    	System.out.println("9. ����");
    	System.out.println("=======================");
    	
    }
}
