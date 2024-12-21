package strClass;

// it is Case Sensitive and checks the last suffix only.

public class Endswith {
public static void main(String[] args) {
	String n = "How are you";
	System.out.println(n.endsWith("u"));
	System.out.println(n.endsWith("you"));
	System.out.println(n.endsWith("are"));
}
}
