package exercise.overall.hero;

import java.util.Arrays;

public class HeroTest {

	public static void main(String[] args) {
		Hero[] heros = new Hero[] {
				new SuperMan(),
				new BatMan(),
				new SpiderMan()
		};
	
		
        System.out.println("Hero ��� : "+Arrays.toString(heros));
        System.out.println();
		for (Hero  h : heros) {//upcating
			h.action();//override�� �ڽ� �޼��� ȣ��
		}
	}

}
