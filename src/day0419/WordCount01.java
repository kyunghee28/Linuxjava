package day0419;

import java.io.File;
import java.io.FileInputStream;

public class WordCount01 {

	public static void main(String[] args) {
		// 파일의 단어의 수를 출력
			
			String fname1 = args[0];
			
			try {
				
				int cnt = 0;
				
				File f = new File(fname1);
				FileInputStream fis = new FileInputStream(f);
				
				byte [] data = new byte[(int)f.length()]; 
				fis.read(data);
				
				String s = new String(data);
				String [] d = s.split(" ");
				
				for(int i = 0; i < d.length ; i++ ) {
					cnt++;
				}
				System.out.println("파일의 모든 단어 수는  :"+ cnt);
			
			}catch(Exception e) {}
	}
}
