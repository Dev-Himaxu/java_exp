package comparable_comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Emp implements Comparable<Emp> {
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

	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}

}

class IDComp implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		if (o1.id == o2.id) {
			return 0;
		} else if (o1.id < o2.id) {

			return -1;
		} else {
			return 1;
		}
	}
}

class SalComp implements Comparator<Emp> {
	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		if (o1.sal == o2.sal) {
			return 0;
		} else if (o1.sal < o2.sal) {
			return -1;
		} else {
			return 1;
		}
	}
}

public class PriorityQueue {
	public static void main(String[] args) {
		Emp e1 = new Emp("Him", 12, 10000);
		Emp e2 = new Emp("Tom", 14, 20000);
		Emp e3 = new Emp("Ram", 13, 30000);

		List<Emp> db = new ArrayList<Emp>();
		db.add(e1);
		db.add(e2);
		db.add(e3);

		System.out.println("Before Sorting");
		Iterator<Emp> iterator = db.iterator();
		while (iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			System.out.println(emp);
		}

		System.out.println("After Sorting");
		Collections.sort(db);
		Iterator<Emp> iterator2 = db.iterator();
		while (iterator2.hasNext()) {
			Emp emp = (Emp) iterator2.next();
			System.out.println(emp);
		}
		
		System.out.println("ID Comparator");
		Collections.sort(db, new IDComp());
		Iterator<Emp>iterator3 = db.iterator();
		while (iterator3.hasNext()) {
			Emp emp = (Emp) iterator3.next();
			System.out.println(emp);
		}
		
		System.out.println("Sal comparator");
		Collections.sort(db, new SalComp());
		Iterator<Emp>iterator4 = db.iterator();
		while (iterator4.hasNext()) {
			Emp emp = (Emp) iterator4.next();
			System.out.println(emp);
		}
		
	}
}


//class Emp implements Comparable<Emp> {
//
//	String name;
//	int id;
//	double sal;
//	public Emp(String name, int id, double sal) {
//		
//		this.name = name;
//		this.id = id;
//		this.sal = sal;
//	}
//	@Override
//	public String toString() {
//		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + "]";
//	}
//	@Override
//	public int compareTo(Emp o) {
//		// TODO Auto-generated method stub
//		return this.id-o.id;
//	}
//}
//class IDCompa implements Comparator<Emp>{
//	@Override
//	public int compare(Emp o1, Emp o2) {
//		// TODO Auto-generated method stub
//		if (o1.id==o2.id) {
//			return 0;
//		} else if (o1.id<o2.id){
//          return -1;
//		}else{
//			return 1;
//		}
//	}
//}
//
//class SalCompa implements Comparator<Emp>{
//	@Override
//	public int compare(Emp o1, Emp o2) {
//		// TODO Auto-generated method stub
//		if (o1.sal==o2.sal) {
//			return 0;
//		} else if (o1.sal<o2.sal) {
//			return -1;
//		}else{
//			return 1;
//
//		}
//	}
//}
//
//public class PriorityQueue{
//	public static void main(String[] args) {
//		Emp emp1 = new Emp("Him", 12, 10000);
//		Emp emp2 = new Emp("Tom", 14, 20000);
//		Emp emp3 = new Emp("Ram", 13, 30000);
//		
//		List<Emp>emps = new ArrayList<Emp>();
//		emps.add(emp1);
//		emps.add(emp2);
//		emps.add(emp3);
//		
//		System.out.println("Before Sorting");
//		Iterator<Emp>iterator=emps.iterator();
//		while (iterator.hasNext()) {
//			Emp emp = (Emp) iterator.next();
//			System.out.println(emp);
//		}
//		
////		System.out.println("After Sorting");
////		Collections.sort(emps);
////		Iterator<Emp>iterator2=emps.iterator();
////		while (iterator2.hasNext()) {
////			Emp emp = (Emp) iterator2.next();
////			System.out.println(emp);
////		}
//	
//		System.out.println("After Sorting");
//		Collections.sort(emps, new IDCompa());
//		Iterator<Emp>iterator2=emps.iterator();
//		while (iterator2.hasNext()) {
//			Emp emp = (Emp) iterator2.next();
//			System.out.println(emp);
//		}
//		
//		System.out.println("Sal Comparator");
//		Collections.sort(emps, new SalCompa());
//		Iterator<Emp>iterator3=emps.iterator();
//		while (iterator3.hasNext()) {
//			Emp emp = (Emp) iterator3.next();
//			System.out.println(emp);
//		}
//	
//	}
//	
//	
//}
