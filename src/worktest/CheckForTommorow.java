package worktest;

import java.util.HashMap;
import java.util.Scanner;

class Cat{
	String name;
	int age;
	void Say() {
		System.out.println("Well done retard " +name +age);
	}
}
public class CheckForTommorow {
public static void main(String[] args) {
Scanner inputcat= new Scanner(System.in);	
Cat yellow = new Cat();
System.out.println("Enter cat name and age");

yellow.name= inputcat.nextLine();
yellow.age=inputcat.nextInt();
yellow.Say();


	inputcat.close();

	
 }
}
