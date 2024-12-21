package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.border.EmptyBorder;

interface Operations {
	void Add(List<Emp> emps);

	void Delete(int id);

	void Update(int id, String name);

	void Search(int id);

	void Show();
}

class Emp {
	String name;
	int id;
	double sal;

	public Emp(String name, int id, double sal) {

		this.name = name;
		this.id = id;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

}

class EmpImp implements Operations {

	List<Emp> db = new ArrayList<Emp>();

	@Override
	public void Add(List<Emp> emps) {
		db.addAll(emps);
		System.out.println("Added");

	}

	@Override
	public void Delete(int id) {
		Iterator<Emp> iterator = db.iterator();
		while (iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			if (emp.getId() == id) {
				iterator.remove();
				System.out.println("Deleted");
			}
		}

	}

	@Override
	public void Update(int id, String name) {

		Iterator<Emp> iterator = db.iterator();
		while (iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			if (emp.getId() == id) {
				emp.setName(name);
				System.out.println("Updated");
			}
		}

	}

	@Override
	public void Search(int id) {
		Iterator<Emp> iterator = db.iterator();
		while (iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			if (emp.getId() == id) {
				System.out.println(emp);
				System.out.println("Found");
			}
		}

	}

	@Override
	public void Show() {
		Iterator<Emp> iterator = db.iterator();
		while (iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			System.out.println(emp);
		}

	}

}

public class Main {
	public static void main(String[] args) {
		Emp e1 = new Emp("Him", 12, 10000);
		Emp e2 = new Emp("Tom", 14, 20000);
		Emp e3 = new Emp("Ram", 13, 30000);

		List<Emp> list = new ArrayList<Emp>();
		list.add(e1);
		list.add(e2);
		list.add(e3);

		EmpImp emp = new EmpImp();
		emp.Add(list);
		emp.Show();
		System.out.println("===========================");
		emp.Delete(14);
		emp.Show();
		System.out.println("========================");
		emp.Update(13, "Harry");
		emp.Show();
		System.out.println("================");
		emp.Search(12);

	}
}

//interface Operations {
//
//	void Add(List<Emp> emps);
//
//	void Delete(int id);
//
//	void Update(int id, String name);
//
//	void Search(int id);
//
//	void Show();
//}
//
//class Emp {
//	String name;
//	int id;
//	double sal;
//
//	public Emp(String name, int id, double sal) {
//
//		this.name = name;
//		this.id = id;
//		this.sal = sal;
//	}
//
//	@Override
//	public String toString() {
//		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + "]";
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public double getSal() {
//		return sal;
//	}
//
//	public void setSal(double sal) {
//		this.sal = sal;
//	}
//
//}
//
//class EmpImp implements Operations{
//
//	List<Emp>list= new ArrayList<Emp>();
//	
//	@Override
//	public void Add(List<Emp> emps) {
//	list.addAll(emps);
//	System.out.println("Added");
//		
//	}
//
//	@Override
//	public void Delete(int id) {
//		Iterator<Emp>iterator = list.iterator();
//		while (iterator.hasNext()) {
//			Emp emp = (Emp) iterator.next();
//			if (emp.getId()==id) {
//				iterator.remove();
//				System.out.println("Deleted");
//				
//			}
//		}
//		
//	}
//
//	@Override
//	public void Update(int id, String name) {
//		Iterator<Emp>iterator=list.iterator();
//		while (iterator.hasNext()) {
//			Emp emp = (Emp) iterator.next();
//			if (emp.getId()==id) {
//				emp.setName(name);
//				System.out.println("Updated");
//				
//			}
//		}
//		
//	}
//
//	@Override
//	public void Search(int id) {
//		Iterator<Emp>iterator= list.iterator();
//		while (iterator.hasNext()) {
//			Emp emp = (Emp) iterator.next();
//			if (emp.getId()== id) {
//				System.out.println(emp);
//				System.out.println("Found");
//				
//			}
//		}
//		
//	}
//
//	@Override
//	public void Show() {
//		Iterator<Emp>iterator=list.iterator();
//		while (iterator.hasNext()) {
//			Emp emp = (Emp) iterator.next();
//			System.out.println(emp);
//		}
//		
//	}
//	
//}
//
//public class Main{
//	public static void main(String[] args) {
//		Emp e = new Emp("Him", 12, 10000);
//		Emp e1 = new Emp("Tom", 14, 20000);
//		Emp e2 = new Emp("Ram", 13, 30000);
//		
//		List<Emp>db= new ArrayList<Emp>();
//		db.add(e);
//		db.add(e1);
//		db.add(e2);
//		
//		EmpImp emp = new EmpImp();
//		emp.Add(db);
//		emp.Show();
//		System.out.println("----------------------------");
//		
//		emp.Delete(14);
//		emp.Show();
//		
//		System.out.println("---------------------------------");
//		emp.Update(13, "Harry");
//		emp.Show();
//	
//		System.out.println("-------------------------------------");
//		emp.Search(13);
//	}
//}
