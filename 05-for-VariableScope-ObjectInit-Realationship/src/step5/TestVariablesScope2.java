package step5;

public class TestVariablesScope2 {
	 public static void main(String[] args) {
		//sp는 참조변수이자 로컬변수이다(main도 메서드다) //메서드 안에 있는게 지역변수. 그 지역안에 있다는 느낌
		//local V는 stack영역에 저장된다.
		//stack은 후입선출이다.
		 SmartPhone sp=new SmartPhone();
		 System.out.println(sp.getModel());//null 기본초기화되서
		 System.out.println(sp.getPrice());//0 정수형의 기본초기화는 0
		 
	}
}
