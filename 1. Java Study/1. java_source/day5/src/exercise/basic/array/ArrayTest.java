package exercise.basic.array;

public class ArrayTest {

	public static void main(String[] args) {
		Array src = new Array("ù��°", 3, 4);
		Array desc = new Array("�ι�°", 3, 4);
		src.makeArrayData();
		desc.makeArrayData();
		src.printArray();
		desc.printArray();
		src.findMatchNumber(src, desc);

	}

}
