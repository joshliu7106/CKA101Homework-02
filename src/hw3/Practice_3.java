package hw3;

import java.util.Scanner;

public class Practice_3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("輸入不想要的數字");
		int a = sc.nextInt();
		int count =0;

		for(int i = 1; i <= 49; i++) {
			if(i / 10 != a && i % 10 != a){
				System.out.print(i + "\t");
				count += 1;
				if(count % 6 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println("可以選的數字有" + count +"個");
		System.out.println("=================");

		
	}
}




