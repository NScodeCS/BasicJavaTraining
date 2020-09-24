package worktest;

//import java.util.Scanner;

public class PractiseArray {
public static void main(String[] args) {

	int [] numbers = {20, 30, 25, 35, 60, };
	int max = 0;
	int second=0;
	
	
	for(int i=0; i<numbers.length; i++) {
		
		if(numbers[i] > max) {
			max=second;
			max=numbers[i];
		
			}else if (numbers[i] > second){
				second = numbers[i];
				
			}
		
	}
	System.out.println("The max is" +max);
		System.out.println("The second max is "+second );
 }




}
