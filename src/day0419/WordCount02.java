package day0419;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashSet;

public class WordCount02 {

	public static void main(String[] args) {
		// 파일의 단어의 수를 출력
			
			String fname1 = args[0];
			
			try {
				File f = new File(fname1);
				FileInputStream fis = new FileInputStream(f);
				
				byte [] data = new byte[(int)f.length()]; 
				fis.read(data);
				
				String s = new String(data);
				String [] d = s.split(" ");
				
				HashSet hs = new HashSet();
				for(int i = 0; i < d.length ; i++ ) {
					hs.add(d[i]);
				}
				
				System.out.print(hs);
			
			}catch(Exception e) {}
	}
}
