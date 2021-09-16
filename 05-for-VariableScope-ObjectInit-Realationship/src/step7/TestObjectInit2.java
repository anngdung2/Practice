package step7;
/*
 *  코드 실행 결과를 예상해보기 
 */
public class TestObjectInit2 {
	public static void main(String[] args) {
		ObjectInitExam exam=new ObjectInitExam();
		Food f=new Food("칼국수",7000);		
		// 칼국수 7000 정보를 가진 객체의 주소값을 
		// pass1 메서드의 인자값으로 전달한다
		exam.pass1(f); // pass1에 sysout을 나타내줬으니 이것만 쳐도 나오는 듯??
		System.out.println(f.getName()+" "+f.getPrice()); //다시 여기서 참조변수 f를 통해 꺼내올때는 돈까스9000은 이미 사라지고(local v여서?)
												//main의 영향을 받으니 칼국수,7000이 뜨게 된다?
		exam.pass2(f);
		System.out.println(f.getName()+" "+f.getPrice()); //인스턴스변수에 저장한 값이라 stack이 아니었나? 그래서 변화된거로뜨는건가?
	}
}


//음 9/5 내 생각은!!
// 새로운 객체를 메소드 안에서 생성한 것 		vs		 동일한 객체를 참조하고 있는것
//	main과 객체가 다르므로 main에 영향을 주지 x//객체가 같으므로 지역변수지만 수정된 것이 들어온더다?(참조변수메모리주소가같다)
// 참조변수메모리가새로생성되어 다른주소다