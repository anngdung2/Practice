package step2;

public class ForLoopService {
	
	//static이 여기 안들어가는 이유는??
	public void PrintInfo(String item,int count) {
		//i가 1부터 count(3)이하일때까지 1씩 증가하며 반복해서 실행한다
	for(int i=1; i<=count; i++)
		System.out.println(item+""+i+'잔');	
	}
	//++i는 앞에있으니 이미 증가해서 sys에 반영하고,
	//i++는 프러스가 뒤에있으니 sysout 다 끝나고 반영한다.
}
