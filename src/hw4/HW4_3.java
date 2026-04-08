package hw4;

public class HW4_3 {
	public static void main(String[] args) {
		String a [] = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int count = 0;
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length(); j++) {
				
				switch(a[i].charAt(j)) {
				case 'a':
					count++;
					break;
				case 'e':
					count++;
					break;
				case 'i':
					count++;
					break;
				case 'o':
					count++;
					break;
				case 'u':
					count++;
					break;
				
				}
			}
			
		}
		System.out.println("共有" + count + "個母音");
		
	}

}
