package worktest;

import java.util.Scanner;

public class Practise {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		//System.out.print(+a);
		 input.close();
		if(a>2) {
			System.out.println("is bug");
		}else {
			System.out.println("who carse anyway");
		}
		
	}
	
}
