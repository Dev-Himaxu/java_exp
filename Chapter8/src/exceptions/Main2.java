package exceptions;

// Throw and throws keywords

import java.io.*;
@SuppressWarnings({"all"})
class A {
	void A() throws IOException {
		IOException i = new IOException();
		throw i;
	}
}
@SuppressWarnings({"all"})
class B {
	void B() throws IOException {
		A a = new A();
		a.A();
	}
}
@SuppressWarnings({"all"})
class C {
	void C() throws IOException {
		B b = new B();
		b.B();
	}
}

public class Main2 {
	public static void main(String[] args) {
		C c = new C();
		try {
			c.C();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}
}
