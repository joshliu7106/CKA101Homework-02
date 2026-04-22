package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Calculator c = new Calculator();
		while(true) {
			try {
				System.out.println("輸入x的值 : ");
				int x = sc.nextInt();
				System.out.println("輸入y的值 : ");
				int y = sc.nextInt();

				System.out.println(c.powerXY(x, y));

			} catch (CalException e) {
//				e.printStackTrace();
				System.out.println(e.getMessage());
			}catch (InputMismatchException e) {
//				e.printStackTrace();
				System.out.println("輸入格式錯誤");
				sc.next();
			}
			System.out.println("=============");
		}

	}
}
