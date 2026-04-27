package hw5.hwPen;

import java.util.Scanner;

public class TestPen {
	public static void main(String[] args) {
		Pen myPen = new Pencil("無印", 100);
		Pen myInk = new InkBrush("毛毛", 100);

		//自行輸入
//		System.out.println("鉛筆品牌與價格");
//		Scanner sc = new Scanner(System.in);
//		myPen.setBrand(sc.next());
//		myPen.setPrice(sc.nextDouble());
//		
//		System.out.println("毛筆品牌與價格");
//		myInk.setBrand(sc.next());
//		myInk.setPrice(sc.nextDouble());
//		
		
		System.out.println("鉛筆品牌為 : " + myPen.getBrand() + " \n鉛筆價格為 : " + myPen.getPrice());
		myPen.write();
		
		System.out.println("毛筆品牌為 : " + myInk.getBrand() + " \n毛筆價格為 : " + myInk.getPrice());
		myInk.write();
		
	}

}
