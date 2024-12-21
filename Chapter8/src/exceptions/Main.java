package exceptions;

// EXAMPLE OF TRY CATCH AND FINALLY BLOCK.
// 1. ARITHMETIC EXCEPTION
// 2. NULLPOINTER EXCEPTION
// 3.ARRAYINDEXOUTOFBOUNDS EXCEPTION
@SuppressWarnings({"all"})
public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");

		try {
			int a = 20 / 0;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);

		}
		try {
			String name = null;
			System.out.println(name.length());
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e);
		}

		try {
			int b[] = new int[5];
			b[10] = 20/0;

		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		catch(ArithmeticException s) {
			
			System.out.println(s);
		}
		
		try {
			String a = "Xyz";
			int i = Integer.parseInt(a);

		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println(e);
		}

		finally {
			System.out.println("Mai Baitha Hu Kismat Ke Bharose");
		}

		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
	}
}
