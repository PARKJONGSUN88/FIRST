package lab.java.core;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		int base=0, height =0;		
	    char answer='\u0000';
		do {		
		Scanner input = new Scanner(System.in);
		System.out.print("Base = ");
		base =input.nextInt(); 
		System.out.print("Height = ");
		height =input.nextInt(); 		
		
		System.out.printf("Triangle Width = %.1f\n",(base*height)*0.5);
		//Math�Լ��� round()�Լ��� �Ǽ��� �Ҽ��� ù��° �ڸ��� �ݿø��Ͽ� ������ ���Ͻ����ݴϴ�
		//�Ҽ��� ��° �ڸ����� ��Ÿ��������ø� 100.0�� ���Ͽ��ٰ� �����ֽø� �ǰ�
		//�Ҽ��� ��° �ڸ����� ��Ÿ��������ø� 1000.0�� ���Ͽ��ٰ� �����ָ� �˴ϴ�.
		System.out.println("Triangle Width ="+ Math.round((base*height)*0.5*100)/100.0);
		// StringŬ������ format �޼ҵ�� ���ϵǴ� ���ڿ� ���¸� �����ϴ� �Լ��ε�
		//�� �Լ��� Ȱ���ϸ� Math.round() �Լ��� ���� �Ҽ��� n��° �ڸ����� �ݿø��Ͽ� ��Ÿ�� �� �ֽ��ϴ�.
		System.out.println("Triangle Width = "+String.format("%.1f", (base*height)*0.5));
		System.out.print("Continue ? ");
		answer = input.next().charAt(0);
		}while(answer=='Y'||answer=='y');

	}

}




