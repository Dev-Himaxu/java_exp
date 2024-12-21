package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
class Emp{
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
	
}

public class Array{
	public static void main(String[] args) {
		Emp e1 = new  Emp("Him", 12, 10000);
		Emp e2 = new Emp("Tom", 14, 30000);
		Emp e3 = new  Emp("Ram", 13, 30000);
		
		ArrayList<Emp>list = new ArrayList<Emp>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		list.set(0, e3);
		System.out.println(list);
		System.out.println(list.contains(e3));
		
		System.out.println("Iterator");
		Iterator< Emp>iterator = list.iterator();
		while (iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			System.out.println(emp);
		}
		
		System.out.println("For Each");
		for (Emp emp : list) {
			System.out.println(emp);
		}
	}
}
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
//}
//
//public class Array {
//	public static void main(String[] args) {
//		Emp e1 = new Emp("Him", 12, 10000);
//		Emp e2 = new Emp("Tom", 14, 20000);
//		Emp e3 = new Emp("Ram", 13, 30000);
//
//		ArrayList<Emp> arrayList = new ArrayList<Emp>();
//		arrayList.add(e1);
//		arrayList.add(e2);
//		arrayList.add(e3);
//
//		System.out.println(arrayList);
//
//		
//		arrayList.set(0, e3);
//		System.out.println(arrayList);
//		
//		arrayList.remove(1);
//		System.out.println(arrayList);
//		
//		System.out.println(arrayList.contains(e2));
//		
//		System.out.println("Iterartor");
//		Iterator<Emp>iterator = arrayList.iterator();
//		while (iterator.hasNext()) {
//			Emp emp = (Emp) iterator.next();
//			System.out.println(emp);
//		}
//		
//		System.out.println("For Each Loop");
//		for (Emp emp : arrayList) {
//			System.out.println(arrayList);
//		}
//		
//		System.out.println("List Iterartor");
//		ListIterator<Emp> iterator2 = arrayList.listIterator();
//		while (iterator2.hasNext()) {
//			Emp emp = (Emp) iterator2.next();
//			System.out.println(emp);
//		}
//		
//		ListIterator<Emp>iterator3=arrayList.listIterator();
//		while (iterator3.hasPrevious()) {
//			Emp emp = (Emp) iterator3.previous();
//			System.out.println(emp);
//		}
//	
//	}
//}
