package step3;

public class TestForLoop2 {
	public static void main(String[] args) {
		//ln이 있으면 줄바꿈이 된다 알파벳 엘엔이다 붙여서 써야함.
		System.out.println("아");
		System.out.println("이");
		System.out.println("****");
		//sysout 빈공간으로 두면 행이 하나씩 띄어진다.
		System.out.println();
		System.out.println();
		System.out.print("아");
		System.out.print("이");
		System.out.print("유");
		//역슬래시 t \t를 하면 간격이 역슬래시 앞의 공간만큼 띄어진다.
		System.out.println("\t팬");
		
	/*
	 	1 2 3 4 5
	 	1 2 3 4 5 
	 	1 2 3 4 5 
	
	 */
		//3행 5열 만들기 옆으로 12345뜨게 하고 3번 반복하게하여 for 문으로 
 		int row=3;
		int col=5;
		//
		for(int i=1; i<=row; i++ ) {
			for(int j=1; j<=col; j++) {
				System.out.print(j+" \t");
			}

			System.out.println(i);
		}
	}
}
