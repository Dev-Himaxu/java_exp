package annotations;

// CLONE AND TOSTRING EXAMPLE

import java.util.Objects;
@SuppressWarnings({"all"})
class F implements Cloneable {
	String name;
	int id;

	public F(String name, int id) {

		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "F [name=" + name + ", id=" + id + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}

public class Clonee {

	public static void main(String[] args) throws CloneNotSupportedException {
		F a = new F("Him", 12);
		//System.out.println(a);

		F a2 = (F)a.clone();
		System.out.println(a2);

	}
}
