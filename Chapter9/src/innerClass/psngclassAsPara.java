package innerClass;

interface A1 {
	void A();
}

abstract class B1 {
	abstract void B();
}

class C1 {

	void C(A1 a, B1 b) {

		System.out.println("Normal");

		a.A();
		b.B();
	}
}

public class psngclassAsPara {
	public static void main(String[] args) {
		C1 c = new C1();

		c.C(new A1() {

			@Override
			public void A() {

				System.out.println("Interface");
			}
		}, new B1() {

			@Override
			void B() {
				System.out.println("Abstract");

			}
		});

	}

}
