package exercise.basic.diary;

import java.util.Scanner;

public class MyDiaryTest {

	public static void main(String[] args) {
		MyDiary[] my = new MyDiary[] {
				new MyDiary("������", 1, 5, "�������"),
				new MyDiary("�߱�", 2, 3 ),
				new MyDiary("����", 1, 7, "����"),
				new MyDiary("OPEN API", 5, 13, "IT������ ��������"),
				new MyDiary("��ȭ", 4, 20, "�������")
		};
		 
		
		while(true) {
			System.out.print("## �� �Է�(����:-1)=>");
			int inputNumber = getUserInput();
			if(inputNumber==-1) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			for(int i=0;i<my.length;i++) {
				int cnt = 1;
				if(my[i].getMonth()==inputNumber) {
					System.out.print(cnt++ +". " +my[i].getMonth()+"�� ");
					System.out.print(my[i].getDay()+"�� : ");
					System.out.print(my[i].getTitle());
					if(my[i].getDesc()!=null) {
						System.out.print(", "+my[i].getDesc());
					}
					System.out.println();
				}
					
				}//for end
			}//while end			
		}//main end
	 
	public static int getUserInput() {
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
	

}
