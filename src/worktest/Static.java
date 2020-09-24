package worktest;
class Thing{
	public String name;
	public static String description;
	public final static int JUST = 2;
	
}

public class Static {

	public static void main(String[] args) {

		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		thing1.name = "bob";
		thing2.name = "marley";
		
		System.out.println("My "+thing1.name);
		System.out.println("My is "+thing2.name);
		System.out.println(Thing.JUST);
		
		//format string
	
		System.out.println("Here is some text. \t That was a tab \n new line");
		System.out.printf("helllll oooooo ");
	}

}
