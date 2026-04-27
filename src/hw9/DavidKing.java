package hw9;

public class DavidKing implements Runnable {

	int rice = 1;

	@Override
	public void run() {
		String name = Thread.currentThread().getName();

		while (rice <= 10) {

			int s = (int) (Math.random() * 2501) + 500;
			System.out.println(name + "吃了第" + rice + "碗飯");
			rice++;

			try {
				Thread.sleep(s);

			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		System.out.println(name + "吃完了！");
	}

	public static void main(String[] args) {
		System.out.println("-----大衛王快食比賽倒數3秒開始！-----");
		for (int i = 3; i >= 1; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		DavidKing d1 = new DavidKing();
		DavidKing d2 = new DavidKing();
		Thread t1 = new Thread(d1, "饅頭人");
		Thread t2 = new Thread(d2, "詹姆士");
		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

		System.out.println("-----大衛王快食比賽結束！-----");
	}

}
