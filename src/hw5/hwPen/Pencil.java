package hw5.hwPen;

public class Pencil extends Pen {

	public Pencil(String brand, double price) {
		super(brand, price); // 呼叫父類別有參數的建構子，完成初始化
		System.out.println("鉛筆建立完成");
	}

	@Override
	public void write() {
		System.out.println("削鉛筆再寫");

	}
	
	@Override
	public double getPrice() {
		return super.getPrice() * 0.8;
	}

}
