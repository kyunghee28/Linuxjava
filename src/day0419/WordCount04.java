package day0419;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer; 
public class WordCount04 {

	public static void main(String[] args) {
		
		String fname = args[0];
	
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(fname));
			String lineDate;		
			StringBuffer sb = new StringBuffer();
			
			while((lineDate = br.readLine()) != null) { // 더이상 읽을게 없으면 null을 준다.
				sb.append(lineDate);
				
			}
			
			String d = sb.toString();
			
			StringTokenizer st = new StringTokenizer(d);
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			
			while(st.hasMoreElements())
			{
				String word = st.nextToken();
				Integer cnt = map.get(word);
				
				if(cnt == null) // 첫 단어 일때 
				{
					map.put(word,1);
				}
				else
				{
					map.put(word, cnt+1);
				}
			}
			
			Iterator keys = map.keySet().iterator();
			while(keys.hasNext())
			{
				String k = (String)keys.next();
				Integer values = map.get(k);
				System.out.println(k+"\t"+values);
			}
			
			br.close();
			System.out.println("프로그램 종료");
		}catch(Exception e) {}
	}
}

