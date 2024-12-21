package innerClass;

class Outer2 {

	void A() {
		class Inner {

			void B() {
				System.out.println("Local");
			}
		}

		Inner i = new Inner();
		i.B();
	}

}

public class Local {
	public static void main(String[] args) {

		Outer2 o = new Outer2();
		o.A();
	}
}
