package java8;

public class UseFurniture implements Furniture{
	public String isLeg(boolean ab) {
		if(ab==true) {
			return "furniture";
		}
		else {
			return "it is not furniture";
			
		}
	}
	public void price(int a) {
		System.out.println(a);
	}
	
	

}
