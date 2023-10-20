package exception;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		String name = null;
		//System.out.println(name);
		try {
		System.out.println(name.toUpperCase());
		}
		catch(Exception a) {
			System.out.println("change uppercase");
		}
		System.out.println("bye");

	}

}
