package day0419;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer; 
public class WordCount04 {

	public static void main(String[] args) {
		
		String fname1 = args[0];
	
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(fname1));
			
			String lineDate;		
			StringBuffer sb = new StringBuffer();
			
			while((lineDate = br.readLine()) != null) { // 더이상 읽을게 없으면 null을 준다.
				sb.append(lineDate);
				
			}
			
			String d = sb.toString();
			
			StringTokenizer st = new StringTokenizer(d);
			System.out.println(st.countTokens());
			br.close();
			
		}catch(Exception e) {}
	}
}

