package hw4;

import java.util.Scanner;

public interface HW4_5 {
	public static void main(String[] args) {

		int [] x = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int sum = 0;

		System.out.println("輸入日期:");

		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month= sc.nextInt();
		int day = sc.nextInt();

		if(month < 1 || month > 12) {
			System.out.println("輸入正確的月份");
			month = sc.nextInt();
		}
		if(day < 1 || day > 31) {
			System.out.println("輸入正確的日期");
			day = sc.nextInt();
		}
		if((year % 4 == 0 && year % 100 != 0)||(year % 400 == 0)){
			x[2] = 29;
			while((day < 1 || day > 29) && (month == 2)) {
				System.out.println("輸入正確的日期");
				day = sc.nextInt();
			}
			
		}
		else if((year % 4 != 0 && year % 100 == 0)||(year % 400 != 0) && (month == 2)){
			while(day < 1 || day > 28) {
				System.out.println("輸入正確的日期");
				day = sc.nextInt();
			}
		}
		
		for (int i = 0; i < month; i++) {		

			sum += x[i];
		}
		sum += day;
		System.out.println(year + "年" + month + "月"+ day + "日");
		System.out.println("輸入的日期為該年第" + sum + "天");




	}

}
