package hw4;

public class HW4_1 {
	public static void main(String[] args) {
		int sum = 0;
		int avg = 0;
		int  a[] = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		for(int i = 0; i < a.length; i++) {
			 sum += a[i]; 
		}
		
		avg = sum / a.length;
		System.out.println("平均值是:" + avg);
		System.out.println("大於平均值的元素有:");
		 for(int i = 0; i < a.length; i++) {
			 if(avg < a[i]) {
				 System.out.print(a[i] + " ");
			 }
		 }
	}

}
