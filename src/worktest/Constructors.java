package worktest;
class Machine{
	private String machine;
	private int age;
	
	public Machine() {
		System.out.println("Hell c1 is running "+machine);
		machine= "john";
		
	}
	public Machine(String name) {
		this.machine=name;
		System.out.println("c2 is running");
	}
	public Machine(String name, int age) {
		this.machine = name;
		this.age = age;
		System.out.println("c3 is running");
	}
	
}
public class Constructors {
public void main(String[]args) {
Machine machine1 = new Machine();	
Machine machine2 = new Machine("aee");
Machine machine3 = new Machine("strrr", 22);

	
}
}
