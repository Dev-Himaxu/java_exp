package innerClass;

@SuppressWarnings({"all"})
interface A {
	void A();
}
@SuppressWarnings({"all"})
abstract class B {
	void B() {

	}
}
@SuppressWarnings({"all"})
class C {
	void C() {

	}
}

class Imp {

	A a = new A() {

		@Override
		public void A() {
			System.out.println("Interface");

		}
	};

	B b = new B() {
		@Override
		void B() {
			System.out.println("Abstract");

		}
	};

	C c = new C() {
		@Override
		void C() {
			System.out.println("Normal Class");
		}
	};
}

public class Anonymous {

	public static void main(String[] args) {
		Imp i = new Imp();
		i.a.A();
		i.b.B();
		i.c.C();

	}
}
