package step3;

public class TestForLoop3 {
	public static void main(String[] args) {
		/*
		 * ������ 2�ܺ��� 9�ܱ��� ���
		 * ��ø for (Nested Loop)�� �̿��Ѵ�
		 * 2*1=2...2*9=18 
		 * 3*1=3...
		 * ...
		 * ...
		 * 9*1=9...9*9=81
		 */
		
	
		//���� ���ϱ��� ������ �ʿ��� ���ѵ�,,
		//sys�� �� �������� �����,,
		
	for(int i=2; i<=9; i++) {
		for(int j=1; j<=9; j++) {
			System.out.print(i+"*"+j+"="+i*j+" \t");
		}
		System.out.println();
	}
			
	}
}
