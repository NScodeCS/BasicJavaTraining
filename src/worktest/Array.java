package worktest;

import java.util.Scanner;

public class Array {
	public static void main(String[]args) {
Scanner input = new Scanner(System.in);

System.out.println("Enter String and the number of letter you want to remove");



	char[] dick = input.nextLine().toCharArray();
	int a = input.nextInt();
char correct;
	
	for(int i =0; i<dick.length; i++) {
		if(a!=i || a<i || a>i) {
			dick[i] = correct;
		}
		System.out.println(correct);
		
	}
	
	
	input.close();

	
	}
}
