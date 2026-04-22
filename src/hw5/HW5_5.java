package hw5;

public class HW5_5 {
	
	public static void main(String[] args) {
		HW5_5 ans = new HW5_5(); //加static不用宣告\
		System.out.print("亂數號碼: ");
//		genAuthCode();  加static
		ans.genAuthCode();
	}
	
	
	public void genAuthCode() {
		String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		String b = "";
				
		for(int i = 0; i < 8; i++) {
//			int rand = (int)(Math.random() * 62);			
			b += a.charAt((int)(Math.random() * 62));
		}
		
//		System.out.println(a.charAt(61));
		
		System.out.println(b);
		
	}

}
