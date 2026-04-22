package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class ReadSample {
	public static void main(String[] args) {
		File file = new File("./src/hw7/Sample.txt");
		int chars = 0;
		int chars2 = 0;
		int lines = 0;
		String line;

		try (FileInputStream fis = new FileInputStream(file);
				FileReader fir = new FileReader(file);
				BufferedReader br = new BufferedReader(fir);
				){
			long bytes = file.length();

			// 檢查檔案是否存在，避免程式崩潰
			if (!file.exists()) {
				System.out.println("找不到 Sample.txt 檔案，請確認檔案位置！");
				return;
			}
			
//			while(fir.read() != -1) {
//				chars += 1;
//			}
			
			while((line = br.readLine()) != null) {
				chars2 += line.length();
				lines++;
			}
			

			
			

			System.out.printf("Sample.txt檔案共有" + bytes + "個位元組" + chars2 + "個字元" + lines +"列");

		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
