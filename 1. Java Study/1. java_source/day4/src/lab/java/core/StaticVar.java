package lab.java.core;

public class StaticVar {
    public static int tickets = 500;
	public static void main(String[] args) {
		System.out.println(tickets);
		tickets-=5;
		System.out.println(StaticVar.tickets);//Ŭ���� ����
		StaticVar sv = new StaticVar();//��ü ����
		System.out.println(sv.tickets);//? 495?
		sv.tickets -= 10;
		StaticVar sv2 = new StaticVar();//��ü ����
		System.out.println(sv.tickets);//?
		System.out.println(sv2.tickets);//?
		sv2.tickets -= 20;
		sv = new StaticVar();
		System.out.println(sv.tickets);//?
		System.out.println(sv2.tickets);//?
		
	}

}
