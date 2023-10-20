package java8;

public interface Furniture {
	
		public String isLeg(boolean ab);
		public static String brand() {
			return "woodland";
		}
		public default void price(int price) {
			System.out.println(price);
		}
		
		

}
