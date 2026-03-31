package hw3;

import java.util.Scanner;

public class Practice_3adv {
	public static void main(String[] args) {
		
		int[] lottery = new int [50];

		for(int i = 0; i < lottery.length; i++) {
			lottery[i] = i;
		}

		System.out.println("討厭的數字");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i = 1; i <= 6; i++) {
			int b = (int)(Math.random()*49) + 1;
			
		if(b % 10 == a || b / 10 == a) {
			i--;
			continue;
		}
		else if(lottery[b] == 0) {
			i--;
			continue;
		}
		System.out.print(b + " ");
		lottery[b] = 0;
		
	
		}



	}

}
