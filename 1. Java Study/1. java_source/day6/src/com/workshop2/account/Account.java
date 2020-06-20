package com.workshop2.account;

public class Account {
private String custId;
private String custName;
private String accountNumber;
int balance; //���� �ܾ�
public Account() {
	
}
public Account(String custId, String custName, String accountNumber, int balance) {	
	this.custId = custId;
	this.custName = custName;
	this.accountNumber = accountNumber;
	if(balance<1) {
		System.out.println("�ܾ� �����Դϴ�.: 0 ��");
		System.exit(0);
	}
	this.balance = balance;
}
public String getCustId() {
	return custId;
}
public void setCustId(String custId) {
	this.custId = custId;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}

public void addBalance(int amount) {
	if(amount<1) {
		System.out.println("�ݾ� �����Դϴ�.: 0 ��");		
	}else if(amount >=1) {
		balance += amount;
	}
	
}
public void subtractBalance(int amount) {
	if(amount<1) {
		System.out.println("�ݾ� �����Դϴ�.: 0 ��");		
	}else if(amount >=1) {
		if( balance>=amount) {
			balance -= amount;
	    }else {
	    	System.out.println("��� �Ұ�!! �ܱ� �����Դϴ�.");	
	    }
	}
}
public void printAccount() {
	System.out.println("===========================");
	System.out.println("����ȣ : "+custId);
	System.out.println("���� : "+custName);
	System.out.println("���¹�ȣ : "+accountNumber);
	System.out.println("�ܾ� : "+balance);
	System.out.println("===========================");
}
}






