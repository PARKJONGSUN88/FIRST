package exercise.overall.orchestra;

public class MusicTest {

	public static void main(String[] args) {
		Instrument[] e =new Instrument[] {
				new Piano(),
				new Flute(),
				new Drum(),
				new Timpani(),
				new Trumpet()
		};//e[0] ~e[4] ��� ��ü�� ������ ��ü
		
		playAll(e);		
		summary(e);		
	}
	
	private static void playAll(Instrument[] e) { //Instrument�������̽��� ���� Ŭ�������� ���ڷ� ������ ��� �ڵ����� Upcasting�̵ǰ�, Downcasting�� �� �ֽ��ϴ�.
		System.out.println("==============���� ����=============");
		for(Instrument instrument : e) {
			instrument.playStart();
		}
		System.out.println();
		System.out.println("==============���� ����=============");
		for(Instrument instrument : e) {
			instrument.playStop();
		}
		System.out.println();
	}
	private static void summary(Instrument[] e) {
		int keyboard = 0, percussion = 0, wind=0;
		System.out.println("==============���� �Ǳ� ���=============");
		for(Instrument instrument : e) {
			System.out.println(instrument);
			if(instrument instanceof Keyboard) {
				keyboard +=1;
			}else if(instrument instanceof Percussion) {
				percussion +=1;
			}else if(instrument instanceof Wind) {
				wind +=1;
			}
		}//for end
		System.out.println();
		System.out.println("==============���� �Ǳ� ��=============");
		System.out.println("## �ǹݾǱ� �� :"+ keyboard);
		System.out.println("## ���Ǳ� �� :"+ percussion);
		System.out.println("## Ÿ�Ǳ� �� :"+ wind);
		System.out.println("=======================================");
		
	}

}
