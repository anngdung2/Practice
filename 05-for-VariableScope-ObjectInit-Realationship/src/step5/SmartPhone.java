package step5;

public class SmartPhone {
	//�ν��Ͻ� ���� (or ��� ���� =member variable)
	private String model;
	private int price; //IV

	//�Ʒ� model�� �Ű�����parameter����, ����������
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
