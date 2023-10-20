package java8;

public class UseElectronics implements Electronics {

	
		
		public String status(boolean a ) {
			if(a==true) {
				return "working";
			}
			else {
				return "not working";
				
			}
		}
		
		public void price(int ab) {
			System.out.println(ab+100);
		}

	

	}

	
