package hw8.HW8_2;

public class Train implements Comparable<Train> {

	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	@Override
	public String toString() {
		return "火車班次：" + number + ", 車種：" + type + ", 出發地：" + start + ", 目的地：" + dest + ", 票價：" + price;
	}

//	@Override
	public int compareTo(Train t) {
//		if (this.number > t.number) {
//			return 1;
//		} else if (this.number == t.number) {
//			return 0;
//		} else
//			return -1;
		
		// 可以簡寫成：
         return this.number - t.number;
	}
}
