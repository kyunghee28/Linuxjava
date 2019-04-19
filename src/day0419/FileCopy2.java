package day0419;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter; 
public class FileCopy2 {

	public static void main(String[] args) {
		
		String fname1 = args[0];
		String fname2 = args[1];
	
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(fname1));
			BufferedWriter bw = new BufferedWriter(new FileWriter(fname2));
			
			String lineDate;			
			while((lineDate = br.readLine()) != null) { // 더이상 읽을게 없으면 null을 준다.
				bw.write(lineDate);
				
			}
			System.out.println("파일복사 성공!!");
			br.close();
			bw.close();
			
		}catch(Exception e) {}
	}
}

