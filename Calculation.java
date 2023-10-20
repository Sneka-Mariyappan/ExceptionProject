
package java8;

public interface Calculation {
public int find(int a,int b);

public static String name() {
	return "addition";
	
}
public default void progress() {
	System.out.println("ArithmeticOperation");
}
}
