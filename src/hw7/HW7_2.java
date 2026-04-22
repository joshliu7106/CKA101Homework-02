package hw7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HW7_2 {
	public static void main(String[] args) {
		File file = new File("./src/hw7/Date.txt");

		try (FileWriter fw = new FileWriter(file,true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw)){

			for(int i = 0; i <10; i++) {
				int rand = (int)(Math.random()*1000) +1;
				pw.println(rand);
				
			}
			pw.println("========");
			System.out.println("檔案寫入成功");




		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
