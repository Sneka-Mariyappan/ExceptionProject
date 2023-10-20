package exception;

public class SingletryMultiCatch {

	public static void main(String[] args) {
		String a = "karan";
		try {
			System.out.println(a.charAt(6));
		}
		
		catch(NullPointerException ab) {
			System.out.println("the value is null");
		}
		catch(ArithmeticException bc) {
			System.out.println("cant divide by 0");
		}
		catch(NumberFormatException ca) {
			System.out.println("not a valid numbers");
		}
		catch(Exception e) {
			System.out.println(a+" Its Simply waste");
		}
		
		
		

	}

}
