package worktest;
import java.util.Scanner;

public class Firsttest {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter num1");
	int num1 = input.nextInt();
	System.out.print("enter num 2");
	int num2 = input.nextInt();
	int sum = num1 * num2;
	input.close();
	
System.out.println(sum);

	}
}
