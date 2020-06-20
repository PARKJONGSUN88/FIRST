package lab.java.core;

public class ArrayTest3 {

	public static void main(String[] args) {
		int[][] array =new int[3][3]; 
		 
		for(int r=0;r<array.length;r++) {
	    	for(int c=0;c<array[r].length;c++) {
	    		array[r][c] = (int)(Math.random()*100+1);	    		
	    	}
		}
		
		System.out.println("####�迭####");
		for(int r=0;r<array.length;r++) {
	    	for(int c=0;c<array[r].length;c++) {
	    		System.out.printf("%2d ", array[r][c] );	    		
	    	}
	    	System.out.println();
		}
		
	   int sum =0, count=0, min = 100 , max=0;
		for(int r=0;r<array.length;r++) {
	    	for(int c=0;c<array[r].length;c++) {
	    		sum+=array[r][c]	;	    		
	    		if(min>array[r][c]) min = array[r][c];
	    		if(max<array[r][c]) max = array[r][c];
	    	}
	    	count+=array[r].length;
	    	System.out.println();
		} 
		 
		System.out.println("�迭�� ��� ����� �� :" +sum);
		System.out.println("�迭�� ��� ����� ��� : " + Math.round(sum*100.0/count)/100.0);
		System.out.println("�迭�� ��� ����� �ּҰ� :" + min);
		System.out.println("�迭�� ��� ����� �ִ밪 :" + max);
	}//main end
}//class end






