package day0419;

	public class Add {// 자바의 출발점은 String 의 main 메소드
		public static void main(String [] args) {
			
			// 예외가 발생하거나 그렇지 않거나 반드시 "작업종료"를 출력하도록 합니다.
			try {					
				
				int a = Integer.parseInt(args[0]);
				int b = Integer.parseInt(args[1]);	
				int r = a + b;
				System.out.println("두수의 합은 :"+ r);
				
			}catch(Exception e){
				System.out.println("두수를 확해인 주세요");
			}finally {
				System.out.println("작업종료!");
			}
		}
}
