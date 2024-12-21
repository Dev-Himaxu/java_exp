package strClass;

public class Contains {

	public static void main(String[] args) {
		String s = "Hi how are you.";
		System.out.println(s.contains("Hi"));  //returns true
		System.out.println(s.contains("how are you"));// returns true
		System.out.println(s.contains("fine")); // returns false.
	}
}
