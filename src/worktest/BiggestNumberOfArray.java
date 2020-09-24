package worktest;

import java.util.Arrays;

public class BiggestNumberOfArray {
	
	public static void main(String[] args) {

		int [] numbers = {20, 30, 25, 35, 60, };
		int max = 0;
		int second=0;
		
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		for(int i=0; i<numbers.length; i++) {
			
			if(numbers[i] > max) {
				second=max;
				max=numbers[i];
			
				}else if (numbers[i] > second){
					second = numbers[i];
				
				}
			
		}
		System.out.println("The max is" +max);
			System.out.println("The second max is "+second );
	 }




	}

