package step5;

public class TestVariablesScope2 {
	 public static void main(String[] args) {
		//sp�� ������������ ���ú����̴�(main�� �޼����) //�޼��� �ȿ� �ִ°� ��������. �� �����ȿ� �ִٴ� ����
		//local V�� stack������ ����ȴ�.
		//stack�� ���Լ����̴�.
		 SmartPhone sp=new SmartPhone();
		 System.out.println(sp.getModel());//null �⺻�ʱ�ȭ�Ǽ�
		 System.out.println(sp.getPrice());//0 �������� �⺻�ʱ�ȭ�� 0
		 
	}
}
