package step7;
/*
 *  �ڵ� ���� ����� �����غ��� 
 */
public class TestObjectInit2 {
	public static void main(String[] args) {
		ObjectInitExam exam=new ObjectInitExam();
		Food f=new Food("Į����",7000);		
		// Į���� 7000 ������ ���� ��ü�� �ּҰ��� 
		// pass1 �޼����� ���ڰ����� �����Ѵ�
		exam.pass1(f); // pass1�� sysout�� ��Ÿ�������� �̰͸� �ĵ� ������ ��??
		System.out.println(f.getName()+" "+f.getPrice()); //�ٽ� ���⼭ �������� f�� ���� �����ö��� ���9000�� �̹� �������(local v����?)
												//main�� ������ ������ Į����,7000�� �߰� �ȴ�?
		exam.pass2(f);
		System.out.println(f.getName()+" "+f.getPrice()); //�ν��Ͻ������� ������ ���̶� stack�� �ƴϾ���? �׷��� ��ȭ�Ȱŷζߴ°ǰ�?
	}
}


//�� 9/5 �� ������!!
// ���ο� ��ü�� �޼ҵ� �ȿ��� ������ �� 		vs		 ������ ��ü�� �����ϰ� �ִ°�
//	main�� ��ü�� �ٸ��Ƿ� main�� ������ ���� x//��ü�� �����Ƿ� ������������ ������ ���� ���´���?(���������޸��ּҰ�����)
// ���������޸𸮰����λ����Ǿ� �ٸ��ּҴ�