package hw3;

import java.util.Scanner;

public class Practice_2 {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int x = (int)(Math.random()*100);
		while(true) {
			System.out.println("請猜一個數字1~100, a =");
			int a = sc.nextInt();

			if(a == x) {
				System.out.println("猜對了");
				break;
			}
			else if(a > x){
				System.out.println("大於正確答案");
			}
			else if(a < x){
				System.out.println("小於正確答案");
			}
		}

	}
}
