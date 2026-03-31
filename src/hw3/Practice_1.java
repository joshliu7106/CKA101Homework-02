package hw3;

import java.util.Scanner;

public class Practice_1{
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入邊長 a: ");
		double a = sc.nextDouble();
		System.out.println("請輸入邊長 b: ");
		double b = sc.nextDouble();
		System.out.println("請輸入邊長 c: ");
		double c = sc.nextDouble();

		if((a + b > c) && (a + c > b) && (b + c > a)) {
			if(a == b && b == c) {
				System.out.println("正三角形");
			}
			else if (a == b || a == c || b == c) {
				System.out.println("等腰三角形");
			}
			else if(a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) {
				System.out.println("直角三角形");

			}
			else {
				System.out.println("其他三角形");
			}
		}
		else {
			System.out.println("不是三角形");
		}


	}

}
