package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

class Emp2 {
	String name;
	int id;
	double sal;

	public Emp2(String name, int id, double sal) {

		this.name = name;
		this.id = id;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp1 [name=" + name + ", id=" + id + ", sal=" + sal + "]";
	}
}

public class LinkList {
	public static void main(String[] args) {

		Emp2 e1 = new Emp2("Him", 12, 10000);
		Emp2 e2 = new Emp2("Tom", 14, 20000);
		Emp2 e3 = new Emp2("Ram", 13, 30000);

		LinkedList<Emp2> emps = new LinkedList<Emp2>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);

		System.out.println(emps);

		emps.removeFirst();
		System.out.println(emps);

		emps.removeLast();
		System.out.println(emps);

		emps.addFirst(e1);
		System.out.println(emps);

		emps.addLast(e3);
		System.out.println(emps);

		System.out.println("Iterator");
		Iterator<Emp2> iterator = emps.iterator();
		while (iterator.hasNext()) {
			Emp2 emp = (Emp2) iterator.next();
			System.out.println(emp);
		}

		System.out.println("For Each Loop");
		for (Emp2 emp : emps) {
			System.out.println(emp);
		}

		System.out.println("List Iterator");
		ListIterator<Emp2> iterator2 = emps.listIterator();
		while (iterator2.hasNext()) {
			Emp2 emp = (Emp2) iterator2.next();
			System.out.println(emp);
		}

		ListIterator<Emp2> iterator3 = emps.listIterator();
		while (iterator3.hasPrevious()) {
			Emp2 emp = (Emp2) iterator3.previous();
			System.out.println(emp);

		}
	}
}
