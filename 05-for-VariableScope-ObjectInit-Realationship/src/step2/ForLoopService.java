package step2;

public class ForLoopService {
	
	//static�� ���� �ȵ��� ������??
	public void PrintInfo(String item,int count) {
		//i�� 1���� count(3)�����϶����� 1�� �����ϸ� �ݺ��ؼ� �����Ѵ�
	for(int i=1; i<=count; i++)
		System.out.println(item+""+i+'��');	
	}
	//++i�� �տ������� �̹� �����ؼ� sys�� �ݿ��ϰ�,
	//i++�� �������� �ڿ������� sysout �� ������ �ݿ��Ѵ�.
}
