package exceptions;

// USERDEFINED EXCEPTION

@SuppressWarnings({"all"})
class VoteException extends Exception {
	VoteException(String s) {
		super(s);
	}

}

public class Main1 {
	void age(int age) throws VoteException {
		if (age < 18) {
			throw new VoteException("You are not eligible");
		} else {
			System.out.println("You are eligible");
		}
	}

	public static void main(String[] args) {

		Main1 m = new Main1();
		try {
			m.age(10);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}
}
