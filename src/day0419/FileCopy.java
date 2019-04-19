package day0419;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream; 
public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fname1 = args[0];
		String fname2 = args[1];
		FileInputStream input = null;
		FileOutputStream output = null;
		
		try {
			//  복사할 파일 지정
			File f = new File(fname1);
			input = new FileInputStream(f);
			
			// 복사된 파일 위치 지정
			output = new FileOutputStream(new File(fname2));
			
			int r = 0;
			byte [] date = new byte[1000];
			while((r = input.read(date)) != -1) { // 한글자씩 읽어 들이기 
				output.write(date,0,r);
			}
			
			System.out.println("파일복사 성공!");
			input.close();
			output.close();
			
		}catch(Exception e) {}
	}
}

