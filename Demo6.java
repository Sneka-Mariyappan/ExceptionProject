package exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo6 {

	public static void main(String[] args) throws IOException {
	File a = new File("C:\\Users\\imsne\\Desktop\\VijaySethupathi.txt");
	FileReader ab = new FileReader(a);
	int temp=0;
	while((temp=ab.read())!=0){
		System.out.print((char)(temp));
		
	}
	

	}

}
