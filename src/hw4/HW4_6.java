package hw4;

public class HW4_6 {
	public static void main(String[] args) {
		int[][] grades = {
			    {10, 35, 40, 100, 90, 85, 75, 70},
			    {37, 75, 77, 89, 64, 75, 70, 95},
			    {100, 70, 79, 90, 75, 70, 79, 90},
			    {77, 95, 70, 89, 60, 75, 85, 89},
			    {98, 70, 89, 90, 75, 90, 89, 90},
			    {90, 80, 100, 75, 50, 20, 99, 75}
			};

			int[] x = new int[8]; 

			for (int i = 0; i < grades.length; i++) {
			    int max = -1;
			    int win = -1;
			    for (int j = 0; j < grades[i].length; j++) {
			        if (grades[i][j] > max) {
			            max = grades[i][j];
			            win = j;
			        }
			    }
			    x[win]++;
			}
		for (int k = 0; k < x.length; k++) {
			System.out.println("第" + (k + 1) + "位同學的最高分次數為： " + x[k] + "次");
		}
		
	}
}
