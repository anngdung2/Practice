package step2;

public class TestForLoop1 {
 public static void main(String[] args) {
	 ForLoopService service=new ForLoopService();
	 String item="테라";
	 int count=3;
	 service.PrintInfo(item,count);
	 //test 클래스의 코드는 변경하지 않고
	 //ForLoopService의 printInfo메서드를 구현해서
	 //아래와 같은 실행결과가 출력되도록 한다
	 /*
	  * 테라 1잔
	  * 테라 2잔
	  * 테라 3잔
	  */
}
}
