package step3;

public class TestForLoop2 {
	public static void main(String[] args) {
		//ln�� ������ �ٹٲ��� �ȴ� ���ĺ� �����̴� �ٿ��� �����.
		System.out.println("��");
		System.out.println("��");
		System.out.println("****");
		//sysout ��������� �θ� ���� �ϳ��� �������.
		System.out.println();
		System.out.println();
		System.out.print("��");
		System.out.print("��");
		System.out.print("��");
		//�������� t \t�� �ϸ� ������ �������� ���� ������ŭ �������.
		System.out.println("\t��");
		
	/*
	 	1 2 3 4 5
	 	1 2 3 4 5 
	 	1 2 3 4 5 
	
	 */
		//3�� 5�� ����� ������ 12345�߰� �ϰ� 3�� �ݺ��ϰ��Ͽ� for ������ 
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
