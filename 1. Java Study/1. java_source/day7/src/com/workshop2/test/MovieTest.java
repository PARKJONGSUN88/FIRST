package com.workshop2.test;

import com.wokshop2.entity.Movie;

public class MovieTest {

	public static void main(String[] args) {
		Movie[] movies = new Movie[] {
			new Movie("������ ����-���� ������", "���� �轼", "��Ÿ��, ����", "�϶����� ���", 2001, 178, "12�� ������"),
			new Movie("Ʈ��������:������ ����", "����Ŭ ����", "SF, �׼�", "���̾� ����", 2009, 149 ),
			new Movie("���� �����", "��ó�� ĿƼ��", "���, ���", "�ٷ� ���� ��", 2003, 134, "15�� ������"),
			new Movie("��Ǫ �Ҵ�", "��ũ ������", "�ִϸ��̼�", "�� ��", "��ü ������")
		};
		System.out.println("<<��ü ��ȭ ���� ��ȸ>>");
		printTitle();
		for(Movie m : movies) {
			System.out.print(m);				
		}
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("<<2005�� ���� ������ ��ȸ>>");
		printTitle();
		for(Movie m : movies) {
			if(m.getReleaseYear()<2005&&m.getReleaseYear()!=0) {
			System.out.print(m);
			}
		}
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("<<�ִϸ��̼� ��ȸ>>");
		printTitle();
		 
		for(Movie m : movies) {
			if(m.getGenre().contentEquals("�ִϸ��̼�")) {
			System.out.print(m);
			}
		}
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		
		System.out.println();
		System.out.println("<<��Ÿ�� 140�� ��ȭ ��ȸ>>");
		printTitle();
		for(Movie m : movies) {
			if(m.getRunTime()>=140	&& m.getRunTime()!=0) {
			System.out.print(m);
			}
		}
		System.out.println("-------------------------------------------------------------------------------------------------------------");
	}//main end
	
	public static void printTitle() {
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println("\t����\t\t\t����\t\t�帣\t\t�ֿ�\t\t�����⵵  ��Ÿ��\t���");
		System.out.println("-------------------------------------------------------------------------------------------------------------");
	}
	

}
