package hw1;

public class Homework_1{
	public static void main(String[] args) {
		int num1 = 12, num2 = 6;
		int sum1 = num1 + num2;
		int sum2 = num1 * num2;
		System.out.println("合是" + sum1);
		System.out.println("積是" + sum2);
		System.out.println("==============");

		int sum3 = 200 / 12;
		int sum4 = 200 % 12;
		System.out.println("一共是" + sum3 + "打又" + sum4 + "顆雞蛋");
		System.out.println("==============");


		int sec = 256559;
		int day = sec / 86400;//24*60*60=86400
		int Lsec = sec % 86400;
		int hour = Lsec / 3600;
		Lsec %= 3600;
		int min = Lsec / 60;
		Lsec %= 60;

		System.out.println(day + "天");
		System.out.println(hour + "小時");
		System.out.println(min + "分鐘");
		System.out.println(Lsec + "秒");
		System.out.println("==============");


		final double pi = 3.1415;
		int r = 5;
		double a = pi * Math.pow(r, 2);
		double c = 2 * r * pi;
		System.out.println("面積是" + a);
		System.out.println("周長是" + c);
		System.out.println("==============");
		

		//複利公式 fv(複利終值) = pv(本利) * (1+r)平方
		double pv = 1500000, R = 0.02;
		double fv = pv * Math.pow(1+R, 10);
		System.out.printf("本金加利息 = %.2f 元%n", fv);
		System.out.println("==============");

		int a1 = 5 + 5;//整數相加
		int a2 = 5 + '5';//字元 '5' 是以其 ASCII (或 Unicode) 編碼值是53，53+5=58 
		String a3 = 5 + "5";//遇到String會轉變為文字相加
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

		


	}


}
