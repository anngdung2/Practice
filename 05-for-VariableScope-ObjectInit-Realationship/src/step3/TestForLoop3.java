package step3;

public class TestForLoop3 {
	public static void main(String[] args) {
		/*
		 * 구구단 2단부터 9단까지 출력
		 * 중첩 for (Nested Loop)를 이용한다
		 * 2*1=2...2*9=18 
		 * 3*1=3...
		 * ...
		 * ...
		 * 9*1=9...9*9=81
		 */
		
	
		//뭔가 곱하기할 변수가 필요할 듯한데,,
		//sys로 가 최종변수 써놓고,,
		
	for(int i=2; i<=9; i++) {
		for(int j=1; j<=9; j++) {
			System.out.print(i+"*"+j+"="+i*j+" \t");
		}
		System.out.println();
	}
			
	}
}
