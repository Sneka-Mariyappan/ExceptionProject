package exception;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HI");
		String name = "sethupathi";
		try {
			name.charAt(11);
		}
		catch(Exception a) {
			System.out.println("Dont use");
		}
		finally {
			System.out.println("This is important message");
		}
		System.out.println("BYE");
		
		

	}

}
