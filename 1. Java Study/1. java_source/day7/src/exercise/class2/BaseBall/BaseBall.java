package exercise.class2.BaseBall;

import java.util.Random;

public class BaseBall {
	public static int player = 0;
	public static int outCount = 0;
	public static int strike = 0;
	public static int ball = 0;

	public static void getStatus() {
		System.out.println(outCount + "�ƿ�, " + strike + "��Ʈ����ũ, " + ball + " ��");		
	}

	public static boolean isStrike() {
		Random r = new Random(2);
		boolean result = false;
		if (r.nextInt() == 1)
			result = true;
		return result;
	}
}
