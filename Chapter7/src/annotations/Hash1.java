package annotations;

// HASH CODE EQUALS AND TOSTRING EXAMPLE.

import java.util.Objects;

class Hash{
	String name;
	int id;
	int age;
	
	public Hash(String name, int id, int age) {
	
		this.name = name;
		this.id = id;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hash other = (Hash) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Hash [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	
	
}

public class Hash1 {

	public static void main(String[] args) {
		
		Hash h = new Hash("Him", 12, 20);
		Hash h1 = new Hash("Him", 12, 20);
		
		System.out.println(h.equals(h1));
		System.out.println(h1);
		System.out.println(h);
				
	}
}
