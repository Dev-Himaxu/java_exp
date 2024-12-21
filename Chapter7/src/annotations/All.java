package annotations;

// FETCH EXAMPLE.


import java.util.Objects;

@SuppressWarnings({"all"})
class Worker implements Cloneable{
	int id;
	String name;
	
	public Worker(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Worker other = (Worker) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "Worker [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Object Deleted");
	}
}
@SuppressWarnings({"all"})
public class All {

	public static void main(String[] args) throws CloneNotSupportedException {
	 Worker w = new Worker(12, "Him");
	// System.out.println(w);
	 w=null;
	 System.gc();
	 
	 Worker w2 = new Worker(12, "Him");
	 //System.out.println(w2);
	 System.out.println(w.equals(w2));
	 
	Worker wclone=(Worker) w.clone();
	System.out.println(wclone);
	 
	}
}
