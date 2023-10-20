package java8;

import java.util.Optional;

public class ExOptional {

	public static void main(String[] args) {
		String a= null;
		Optional<String> check = Optional.ofNullable(a);
		System.out.println(check);
		if(check.isPresent()) {
			System.out.println(a.toUpperCase());

	}
		else {
			System.out.println("the value is empty");
		}
		System.out.println(check.isEmpty());
		System.out.println();
		/*Optional<String> name = Optional.ofNullable(null);
		System.out.println(name.get());*/
		System.out.println(check.orElse("this is nothing"));
		System.out.println(check.orElseThrow(()->new NullPointerException()));
		

}
}
