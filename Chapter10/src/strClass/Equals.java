package strClass;

public class Equals {

	public static void main(String[] args) {
		String n = "hello";
		String n2= "Hello";
		String n3= "hello";
		System.out.println(n.equals(n2));  // equals is character specific.Here It shows false 
		System.out.println(n.equals(n3));
		
		//Using equalsIgnorecase
		
		System.out.println(n.equalsIgnoreCase(n2)); // it doesn't care abt alphabet it check only the letters are matching or not. 
	}                                               // But here It shows true.
}
