package hw4;

public class HW4_2 {
	public static void main(String [] arg) {
		String s = "Helloe World";
		String out = "";
		for(int i = s.length()-1; i >= 0; i--) {
			out += s.charAt(i);
		}
		System.out.println(out);
	}

}
