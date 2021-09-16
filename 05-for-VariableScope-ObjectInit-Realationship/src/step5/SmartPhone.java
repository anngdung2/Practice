package step5;

public class SmartPhone {
	//인스턴스 변수 (or 멤버 변수 =member variable)
	private String model;
	private int price; //IV

	//아래 model은 매개변수parameter이자, 지역변수임
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
