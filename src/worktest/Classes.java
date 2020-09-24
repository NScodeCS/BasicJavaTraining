package worktest;

import java.util.Scanner;

class Dog{
	int number;
	String Dogs;
	String gender;
	String Talk() {
	
		System.out.println("Hey " +gender);
		return gender;

	}
	void DogDetails(){
	System.out.println("My gender is "+gender);
	}
}

public class Classes {
	
	
public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
	
	
Dog doggy = new Dog();
System.out.println("enter gender");
doggy.gender = input.nextLine();
doggy.DogDetails();
Dog doggy1 = new Dog();
System.out.println("enter gender");
doggy1.gender = input.nextLine();
doggy1.DogDetails();
doggy1.Talk();
input.close();
	}
}
