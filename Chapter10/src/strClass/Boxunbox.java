package strClass;

// Wrapper class

@SuppressWarnings({"all"})

public class Boxunbox {
	public static void main(String[] args) {
		int a = 10;
		Integer integer = new Integer(a);      //BOXING
		System.out.println(integer+a);
		
		Integer i2 = new Integer(50);         // UnBOXING
		int b=i2;
		System.out.println(b);
		
		String name = "Him";
		String s = new String(name);
		System.out.println(s);
	}

}

