package lab.java.core;

import java.util.Scanner;

public class While4 {

	public static void main(String[] args) {	
		System.out.println("���� �ΰ��� �Է��ϼ���");
		int start=0, end =0;		
		Scanner input = new Scanner(System.in);
		
		start= input.nextInt();
		end= input.nextInt();	
		
		if(start>end) {
			int temp = start;
			start=end;
			end =temp;
		} 
		
		for(int i = start;i<end+1;i++) {
			System.out.print(i+" ");
		}
		 
	}
}






