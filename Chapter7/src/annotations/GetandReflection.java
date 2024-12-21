package annotations;

import java.lang.reflect.Method;

class Emp1{
	String name;
	int id;
	public Emp1(String name, int id) {
		
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Emp1 [name=" + name + ", id=" + id + "]";
	}
	 
}

public class GetandReflection {
public static void main(String[] args) {
	Emp1 emp1 = new Emp1("Him",12);
	
	Method method[]=emp1.getClass().getMethods();
	for (int i = 0; i < method.length; i++) {
		System.out.println(method[i]);
	}
}
}
