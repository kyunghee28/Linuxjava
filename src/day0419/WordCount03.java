package day0419;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;

public class WordCount03 {

	public static void main(String[] args) {
		
			String fname1 = args[0];
			
			try {
				File f = new File(fname1);
				FileInputStream fis = new FileInputStream(f);
				
				byte [] data = new byte[(int)f.length()]; 
				fis.read(data);
				
				String s = new String(data);
				String [] d = s.split(" ");
				
				HashMap hm = new HashMap(); // key 중복 불가 value 중복가능   
				
				for(int i = 0; i < d.length ; i++ ) {
					
					int cnt = 1; // hm.get(d[i]) 가 null 인 경우 즉 , 처음 담은 단어인 경우 1로 시작 
					
					if(hm.get(d[i]) != null){ 
						
						// 위에서 HashMap <String,Integer> hm = new HashMap<String,Integer>(); 라고 제레닉을 해줘면 
						//(int) 형변환 안해줘도 된다.
						cnt = (int)hm.get(d[i])+1; //HashMap 의 get : 지정한 key에 해당하는 데이터(value) 반환(여기선 count가 반환)
									// cnt는 위에서 1로 초기화 되지만 if문은 타면서 key값에 있던 value값이 cnt로 들어가기 때문에 원래 있던 cnt에 +1이 되는 것
					}
					
					hm.put(d[i],cnt);
				}
				
				System.out.println(hm);
				System.out.println(hm.size());
				
				// System.out.println(hm); 을 한줄에 한 단어씩 출력 하는 코드
				Iterator keys = hm.keySet().iterator();
				while(keys.hasNext())
				{
					String k = (String)keys.next();
					Integer values = (int)hm.get(k);
					System.out.println(k+"\t"+values);
				}
				
				
			}catch(Exception e) {}
	}
}
