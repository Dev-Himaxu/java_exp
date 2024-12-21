package innerClass;

class Outer1 {

	static class Inner {

		static void Meth() {
			System.out.println("Static");
		}
	}

}
@SuppressWarnings({"all"})
public class Static {
	public static void main(String[] args) {
		Outer1 o = new Outer1();
		Outer1.Inner i = new Outer1.Inner();

		Outer1.Inner.Meth();
	}

}
