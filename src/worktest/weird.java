package worktest;

import java.util.Scanner;

public class weird {
public static void main(String[]args) {
	Scanner read = new Scanner(System.in);
	System.out.println("Enter number");
	int a = read.nextInt();
	read.close();
	if(a % 2 ==0 ) {
		if(a>2 && a<5) {
		System.out.println("not weird "+a);
		}else if(a>6 && a<20) {
			System.out.println("Weird "+a);
		}else {
			System.out.println("Not WEIRD");
		}
	}else {
		System.out.println("Weirdoooo");
	}
	
	
	
	
}
}
