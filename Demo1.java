package exception;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		int a=10;
		int b=0;
		try {
		System.out.println(a/b);
		}
		catch(Exception ab) {
			System.out.println("DONT DIVIDE NUMBER BY 0");
			//System.out.println(ab);
			//ab.printStackTrace();
		}
		System.out.println("Bye");

	}

}
