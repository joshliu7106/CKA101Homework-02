package hw4;

import java.util.Scanner;

public class HW4_4 {
	public static void main(String[] args) {
		int x[][] = { {25, 32, 8, 19, 27}, 
				{2500, 800, 500, 1000, 1200} 
		};

		int people = 0;

		System.out.println("輸入要借的金額:");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();

		System.out.print("有錢可借的員工編號:");
		for(int i = 0; i < x[1].length; i++) {
			if(x[1][i] >= money) {
				System.out.print(x[0][i] + " ");
				people++;
			}

		}
		System.out.println("共" + people + "人");
	}
}
