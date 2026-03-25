package hw2;

public class Homework_2 {
	//	計算1~1000偶數和
	public static void main(String[] args) {
		int  sum = 0;

		for(int i = 0; i <=1000; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		System.out.println("===================");

		//		計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
		int sum1 = 1;
		for(int i = 1; i <= 10; i++) {
			sum1 = sum1 * i;
		}
		System.out.println(sum1);
		System.out.println("===================");

		//		計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
		int j = 1,sum2 = 1;
		while (j <= 10) {
			sum2 = sum2 * j;
			j++;
		}
		System.out.println(sum2);
		System.out.println("===================");

		//		請設計一隻Java程式，輸出結果為以下：
		//		1 4 9 16 25 36 49 64 81 100
		int sum3 = 0;
		for(int i = 0;i <= 100;i++) {
			if(i % 2 !=0 && i + sum3 <= 100) {
				sum3 += i;
				System.out.print(sum3 +" ");
			}

		}
		System.out.println();
		System.out.println("===================");

		//		阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
		//		輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		int count = 0;
		for (int i = 1; i <= 49; i++) {
			if (i / 10 != 4 && i % 10 != 4) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("可以選擇的數字有：" + count + " 個");
		System.out.println("===================");
		
		for(int i = 10; i > 0; i--) {
			for(int x = 1; x <= i; x++) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		System.out.println("===================");
		
		char latter = 'A';
		for (int i = 1; i <= 6; i++) {
			for(int x = 1; x <= i; x++) {
				
				System.out.print(latter);
			}
			System.out.println();
			latter++;
		}
		
	}


}
