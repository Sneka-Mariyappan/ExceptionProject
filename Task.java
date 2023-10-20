package exception;

public class Task {

	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub
		String name = "karan";
		int age = 17;
		if(age>=18) {
			System.out.println("welcome "+name);
		}
		else {
			throw new AgeException("not valid");
		}
		String gender = "male";

	}

}
