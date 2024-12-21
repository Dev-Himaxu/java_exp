package annotations;

class Ab {
	Ab a() {
		return this;
	}
}

class Bc extends Ab {
	@Override
	Bc a() {// Here method is re overridden.
		System.out.println("Meth");
		return this;
	}
	
	void meth() {
		System.out.println("MethB");
	}
}

public class Cov {
	public static void main(String[] args) {

	Bc bc = new Bc();
	bc.a();
	
	new Bc().a().meth();

	}
}
