package innerClass;

class Outer {
	private int a = 20;

	class Inner {
		void b() {
			System.out.println(a);
		}
	}
}

public class Global {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();

		i.b();
	}
}
