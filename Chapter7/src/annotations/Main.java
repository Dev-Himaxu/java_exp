package annotations;

// DEPRICATED , SUPPRESSWARNINGS AND OVERRIDE ANNOTATION EXAMPLE.

import java.util.ArrayList;

class A{

	@Deprecated
	void ShowTheEntryTime() {
		
		System.out.println("A");
		
	}
	
}

class B extends A{
	
	@Override
	void ShowTheEntryTime() {
		
		System.out.println("B");
		
		//super.ShowTheEntryTime();
	}
}

public class Main {

    @SuppressWarnings({"Unchecked","all"})
	
	public static void main(String[] args) {

    	ArrayList a = new ArrayList();
    	a.add("A");
    	a.add("A");
	
    }
}