package lab.java.core;

import java.util.Scanner;

public class Operator3 {

	public static void main(String[] args) {
		//���׿����� ����ǥ����?ǥ����1:ǥ����2
		//������ �Է¹޾Ƽ� ¦������ Ȧ������ ���
		Scanner input = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���=>");
		int num = input.nextInt();
		System.out.print(num%2==0?"¦��":"Ȧ��");
		
		//����ĳ����� �ڵ����� ���� ū Ÿ������ ����ȯpromotion�� �Ͼ�ϴ�.
		double result = 3>4?99.9:90;		
		int result2 = (int)(3>4?99.9:90);

	}

}
