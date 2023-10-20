package java8;

public class UseCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation add=(x,y)->x+y;
		System.out.println(add.find(10, 20));
		
		Calculation sub=(x,y)->x-y;
		System.out.println(sub.find(40, 30));

	}

}
