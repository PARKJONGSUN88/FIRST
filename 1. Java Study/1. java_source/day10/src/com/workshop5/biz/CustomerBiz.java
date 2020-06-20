package com.workshop5.biz;

import java.util.ArrayList;

import com.workshop5.entity.Customer;
import com.workshop5.util.CustomerUtil;

public class CustomerBiz implements ICustomerBiz{
    private ArrayList<Customer> customers;
	@Override
	public void initializeCustomer() {
		customers = new ArrayList();		 
		insertCustomer();		 
	}

	@Override
	public void printAllCustomer() {
		System.out.println("-----------------�� ����------------------------");
		for(int i=0;i<customers.size();i++) {
			System.out.print(i+1+".[�̸�]"+customers.get(i).getName()+"\t");
			System.out.print("[����]"+customers.get(i).getAge()+"\t  ");
			System.out.print("[��ȭ��ȣ]"+customers.get(i).getPhone()+"\n");			
		}		
		System.out.println("--------------------------------------------------");
	}

	@Override
	public void insertCustomer() {
		customers.add( new Customer("Lee", 28, "010-5678-1234"));
		customers.add( new Customer("Park", 31, "010-4567-9876"));
		customers.add( new Customer("Choi", 25, "010-1111-2222"));
	}

	@Override
	public void insertCustomer(Customer customer) {
		customers.add(customer);		
	}

	@Override
	public void deleteCustomer() {
		System.out.println("-------------------------------");
		System.out.println("�� ������ �����մϴ�.");
		System.out.println("������ ���� ��ȣ�� �Է��ϼ���");
		System.out.println("-------------------------------");
		System.out.print(">��ȣ:");
		int num = Integer.parseInt(CustomerUtil.getUserInput());
		customers.remove(num-1);
		System.out.println("@"+num+"�� �� ������ �����Ͽ����ϴ�.");
	}

}
