package com.grade.test;

import com.grade.biz.GradeManager;
import com.grade.biz.IGradeManager;
import com.grade.util.CommonUtil; 

public class GradeTest {

	public static void main(String[] args) {
		IGradeManager manager = new GradeManager();
		int menu =0;
		while(true) {
			printMenu();
			System.out.print("## �޴� �Է� ==>");
			try {
			     menu = Integer.parseInt(CommonUtil.getUserInput());
			}catch(NumberFormatException e) {
				System.out.println("## ���ڸ� �Է��ϼ���!");
				continue;
			}
			if (menu==9) {				 
				System.out.println("##���� ���� �ý����� �����մϴ�.!!");				 
				break;
			}
			switch(menu) {
			case 1:
			case 2:
			case 3: manager.printStudents(menu-1); break;
			default : System.out.println("##���� �޴��� �����Ͽ����ϴ�.!!");			 
			}
		}//while end

	}
	
	public static void printMenu() {
		System.out.println("===== << ���� ���� �ý��� �޴� >> ======");
    	System.out.println("1. ��ü ������ ���");
    	System.out.println("2. �հ� ������ ���");
    	System.out.println("3. ���հ� ������ ���");
    	System.out.println("9. ����");
    	System.out.println("=======================================");
	}

}
