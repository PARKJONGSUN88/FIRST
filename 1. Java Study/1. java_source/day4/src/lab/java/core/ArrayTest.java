package lab.java.core;

public class ArrayTest {

	public static void main(String[] args) {
		int[][] nums; //�迭 ����
		int nums2[][];
		int[] nums3[];
		nums = new int[5][5];//�迭 ����
		nums[0][0] = (int)(Math.random()*12+1);
		
		nums2 = new int[5][];
		//nums3 = new int[ ][5];
		nums3 = new int[][] {{1, 2, 3},
			{4, 5, 6, 7}, {8, 9, 10, 11, 12}}; // �迭�� ��� �ʱ�ȭ
	    System.out.println(nums3.length);//2���������� �ళ��, 1���� �迭�� ����
	    System.out.println(nums3[0].length);//ù��° 1���� �迭�� ��� ����
	    System.out.println(nums3[1].length);//�ι�° 1���� �迭�� ��� ����
	    System.out.println(nums3[2].length);//����° 1���� �迭�� ��� ����
	    
	    for(int r=0;r<nums3.length;r++) {
	    	for(int c=0;c<nums3[r].length;c++) {
	    		System.out.print(nums3[r][c]+" ");
	    	}
	    	System.out.println();
	    }

	}

}
