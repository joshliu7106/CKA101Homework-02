package hw5;

public class HW5_3 {
	
	public int maxElement(int[][] x) {

		int max = 0;

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}

	public double maxElement(double x[][]) {
		double max = 0;
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				if(x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}




	public static void main(String[] args) {
		HW5_3 a = new HW5_3();

		int[][] intArray = {
				{6, 28, 3},
				{9, 71, 2}
		};

		double[][] doubleArray = {
				{1.2, 4.5, 3.3},
				{19.5, 7.8, 2.1}
		};
		
		System.out.println(a.maxElement(intArray));
		System.out.println(a.maxElement(doubleArray));
		
	}
}