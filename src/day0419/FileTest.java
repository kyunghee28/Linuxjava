package day0419;

import java.io.FileReader; 
public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fname1 = args[0];
		
		try {
			FileReader f = new FileReader(fname1);
			
			int r;
			while((r = f.read()) != -1) { // 한글자씩 읽어 들이기 
				System.out.print((char)r);
			}
			
			f.close();
		}catch(Exception e) {}
	}
}
