package exception;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HI");
		int[] a = {10,20,30};
		try {
		System.out.println(a[5]);
		}
		
		catch(Exception b) {
			System.out.println("Dont use");
		}
		System.out.println("Bye");
	}

}
