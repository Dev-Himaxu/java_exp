package collection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

class Emp3 {
	String name;
	int id;
	double sal;

	public Emp3(String name, int id, double sal) {

		this.name = name;
		this.id = id;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + "]";
	}

}

public class Stack1 {
	public static void main(String[] args) {

		Emp3 e1 = new Emp3("Him", 12, 10000);
		Emp3 e2 = new Emp3("Tom", 14, 20000);
		Emp3 e3 = new Emp3("Ram", 13, 30000);
		
           Stack<Emp3>stack = new Stack<Emp3>();
          stack.push(e1);
          stack.push(e2);
          stack.push(e3);
          
          System.out.println(stack.size());
          System.out.println(stack.peek());
          
          System.out.println(stack.pop());
          System.out.println(stack.size());
          System.out.println(stack.isEmpty());
          
          System.out.println("Iterator");
          Iterator<Emp3>iterator =stack.iterator();
          while (iterator.hasNext()) {
			Emp3 emp3 = (Emp3) iterator.next();
			System.out.println(emp3);
			
		}
          
          System.out.println("For Each Loop");
          for (Emp3 emp3 : stack) {
			System.out.println(emp3);
		}
          
          System.out.println("List Iterator");
          ListIterator<Emp3>iterator2=stack.listIterator();
          while (iterator2.hasNext()) {
			Emp3 emp3 = (Emp3) iterator2.next();
			System.out.println(emp3);
		}
          ListIterator<Emp3>iterator3= stack.listIterator();
          while (iterator3.hasPrevious()) {
			Emp3 emp3 = (Emp3) iterator3.previous();
			System.out.println(emp3);
		}
           
           
	
	}
}
//}
//try {
//	Stack stack = new Stack<>();
//	stack.push(1);    // Add
//	stack.push(2);
//	stack.push(3);
//	stack.push(4);
//	
//	System.out.println(stack.size());  
//	System.out.println(stack.peek());
//	
//	
//	System.out.println(stack.pop());     // Delete
//	System.out.println(stack.size());
//	
//	System.out.println(stack.pop());
//	System.out.println(stack.pop());
//	System.out.println(stack.size());
//	
//	System.out.println(stack.isEmpty());     
//	System.out.println(stack.pop());
//	System.out.println(stack.pop());
//	
//} catch (Exception e) {
//	System.out.println(e);
//}
//}
//}
//
//
