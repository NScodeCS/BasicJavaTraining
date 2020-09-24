package worktest;

import java.util.Scanner;

class Persons{
	
	String person;
	int age;
	
	void SpeakDog(String text) {
		System.out.println("Hello " +person +age+text);
		
	}
	int returnYears(){
		int years = 65-age;
		return years;
		
	}
	public void jump(int height) {
		height = height *2;
		System.out.println("you can jump "+height);
	}
	public void move(Double distance, double length) {
		distance = distance * length;
		System.out.println(+distance);
	}
}



public class Methods {
	public static void main(String[]args) {
		//create first person
		Persons persons = new Persons();
		persons.person = "nik";
		persons.age=22;
		persons.SpeakDog(null);
		int years =persons.returnYears();
		System.out.println( "years left " +years);
		persons.jump(10);
		//persons.move(10.0,10.0);
		double dick;
		double cock;
	System.out.println("Enter values");
	Scanner input = new Scanner(System.in);
	dick = input.nextDouble();
	cock = input.nextDouble();
	persons.move(dick, cock);
	
		//create second person
		/*
		Persons persons1 = new Persons();
		persons1.person="kotsios";
		persons1.age=12;
		 years = persons1.returnYears();
		System.out.println("Years left "+years);*/

}
}
