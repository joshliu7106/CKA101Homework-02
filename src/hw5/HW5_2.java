package hw5;

public class HW5_2 {
	public static void randAvg() {
		int sum = 0;
		int [] random = new int[101];

		for(int i = 0; i < random.length; i++) {
			random[i] = i;
		}

		System.out.println("你的號碼是");

		for(int i = 1; i <= 10; i++) {
			int b = (int)(Math.random()*101);
			
			if(random[b] == 0) {
				i--;
				continue;
			}
			
			sum += b; 
			System.out.print(b + " ");
			random[b] = 0;
		}
		System.out.println();
		System.out.print("平均是: ");
		System.out.println(sum / 10);

//		亂數會重複
//		int sum = 0;
//		
//		for(int i = 0; i < 10; i++) {
//			int random = (int)(Math.random() * 101);
		
//			System.out.print(random + " ");
//			sum += random;
//		}
//		System.out.println();
//		System.out.println("平均是： " + (sum / 10));
//		
//	
		
		
	}

	public static void main(String[] args) {
		
		randAvg();
	}

}
