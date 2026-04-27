package hw5.hwPen;

public class InkBrush extends Pen {

	public InkBrush(String brand, double price) {
		super(brand, price);
		System.out.println("毛筆建立完成");
	}

	@Override
	public void write() {
		System.out.println("沾墨汁再寫");
	}

	@Override
	public double getPrice() {
		return super.getPrice() * 0.9;
	}
}
