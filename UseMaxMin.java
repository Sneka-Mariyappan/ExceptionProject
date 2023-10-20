package java8;

public class UseMaxMin {

	public static void main(String[] args) {
		Max m1 = new Max();
		MaxMin a = m1::max;
		int[] num = {10,20,30,100};
		System.out.println(a.find(num));

	MaxMin b = Max::min;
	System.out.println(b.find(num));
	
	
	

	
}
}
