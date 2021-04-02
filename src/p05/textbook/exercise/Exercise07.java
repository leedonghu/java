package p05.textbook.exercise;

public class Exercise07 {
	public static void main(String[] args) {
//		int max = Integer.MIN_VALUE;
//		int min = Integer.MAX_VALUE;
		double sum = 0;
		double avg = 0;
		int[] array = { 1, 5, 3, 8, 2};
		int max = array[0];
		int min = array[0];
		for(int i=0; i<array.length; i++) {
			sum += array[i];
			
			if(max < array[i]) {
				max = array[i];
			}
			if(min > array[i]) {
				min = array[i];
			}
			
		}
		avg = sum / array.length;
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		
		
		
		
		
		
	}
}
