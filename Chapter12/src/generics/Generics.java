package generics;

class BoxObject<E> {
	E a;

	E showName(E a) {
		return a;
	}
}

public class Generics {
	public static void main(String[] args) {
		BoxObject<Integer> b = new BoxObject<Integer>();
		System.out.println(b.showName(12));

		BoxObject<String> b1 = new BoxObject<String>();
		System.out.println(b1.showName("HIM"));

		BoxObject<Double> b2 = new BoxObject<Double>();
		System.out.println(b2.showName(234234.));
		BoxObject<Float>f= new BoxObject<Float>();
		System.out.println(f.showName(2324f));
				
	}

}
