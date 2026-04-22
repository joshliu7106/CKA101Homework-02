package hw5;

import java.util.Scanner;

public class HW5_1 {
	
	
	public static void starSquare(int width, int height) {
		for(int i = 0; i < height; i ++) {
			for(int j = 1; j < width; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("輸入寬高:");
		int w = s.nextInt();
		int h = s.nextInt();
		starSquare(w, h);
		}

}
