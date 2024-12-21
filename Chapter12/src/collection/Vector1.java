package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

import collection1.Main;

class Emp4 {
	String name;
	int id;
	double sal;

	public Emp4(String name, int id, double sal) {

		this.name = name;
		this.id = id;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp4 [name=" + name + ", id=" + id + ", sal=" + sal + "]";
	}

}

public class Vector1 {
	public static void main(String[] args) {
		Emp4 e1 = new Emp4("Him", 12, 10000);
		Emp4 e2 = new Emp4("Tom", 14, 20000);
		Emp4 e3 = new Emp4("Ram", 14, 30000);

		Vector<Emp4> vect = new Vector<Emp4>();
		vect.add(e1);
		vect.add(e2);
		vect.add(e3);

		System.out.println(vect);

		System.out.println("-----------------------");

		vect.set(1, e1);
		System.out.println(vect);

		System.out.println("_____________________");

		vect.remove(1);
		System.out.println(vect);

		System.out.println("_______________");

		System.out.println(vect.contains(e1));
		
		System.out.println("Iterator");
		Iterator<Emp4>iterator = vect.iterator();
		while (iterator.hasNext()) {
			Emp4 emp4 = (Emp4) iterator.next();
			System.out.println(emp4);
		}
		
		System.out.println("For each");
		for (Emp4 emp4 : vect) {
			System.out.println(emp4);
		}
		
		System.out.println("List Iterator");
		ListIterator<Emp4>iterator2=vect.listIterator();
		while (iterator2.hasNext()) {
			Emp4 emp4 = (Emp4) iterator2.next();
			System.out.println(emp4);
		}
		
		ListIterator<Emp4>iterator3=vect.listIterator();
		while (iterator3.hasPrevious()) {
			Emp4 emp4 = (Emp4) iterator3.previous();
			System.out.println(emp4);
		}
		System.out.println("Enumerator");
		Enumeration<Emp4>enumeration=  vect.elements();
		while (enumeration.hasMoreElements()) {
			Emp4 emp4 = (Emp4) enumeration.nextElement();
			System.out.println(emp4);
		}
		

	}
}

//class Emp4{
//	String name;
//	int id;
//	double sal;
//	public Emp4(String name, int id, double sal) {
//		
//		this.name = name;
//		this.id = id;
//		this.sal = sal;
//	}
//	@Override
//	public String toString() {
//		return "Emp1 [name=" + name + ", id=" + id + ", sal=" + sal + "]";
//	}
//}
//
//public class Vector {
//
//	
//	public static void main(String[] args) {
//		Emp4 e = new Emp4("Him", 12, 1000);
//        Emp4 emp1 = new Emp4("Tom", 13, 2000);
//        Emp4 emp12 = new Emp4("Ram", 14, 3000);
//        
//        java.util.Vector<Emp4> vector = new java.util.Vector<Emp4>();
//        
//        
//        
//        vector.add(e);
//        vector.add(emp1);
//        vector.add(emp12);
//        
//        System.out.println(vector);
//        
//        System.out.println("___________________");
//        
//        vector.set(2, e);
//        System.out.println(vector);
//        
//        System.out.println("_______________________");
//        
//        vector.remove(1);
//        System.out.println(vector);
//        
//        System.out.println("____________________________");
//        
//       
//        System.out.println(vector.contains(e));
//        
//        System.out.println("____________________");
//        
//        System.out.println("Iterator");
//        
//        Iterator<Emp4> iterator = vector.iterator();
//        while (iterator.hasNext()) {
//			Emp4 emp13 = (Emp4) iterator.next();
//			System.out.println(emp13);
//			
//		}
//        
//        System.out.println("For Each Loop");
//        
//        for (Emp4 emp13 : vector) {
//			System.out.println(emp13);
//		}
//        
//        System.out.println("list Iterator");
//        
//        ListIterator<Emp4> iterator2 = vector.listIterator();
//        while (iterator2.hasNext()) {
//			Emp4 emp13 = (Emp4) iterator2.next();
//			System.out.println(emp13);
//			
//		}
//
//        System.out.println("previous");
//        
//        while (iterator2.hasPrevious()) {
//			Emp4 emp13 = (Emp4) iterator2.previous();
//			System.out.println(emp13);
//			
//		}
//        
//        System.out.println("Enumerator");
//        
//        Enumeration<Emp4> enumeration = vector.elements();
//        while (enumeration.hasMoreElements()) {
//			Emp4 emp13 = (Emp4) enumeration.nextElement();
//			System.out.println(emp13);
//		}
//        
//	}
//}
