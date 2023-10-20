package exception;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		String num = "TN63";
		try {
			int n1 = Integer.parseInt(num);
			System.out.println(n1);
		}
		finally {
			System.out.println("This is important message");
		}
		System.out.println("bye");

	}

}
