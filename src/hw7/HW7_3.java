package hw7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class HW7_3 {
	public static void main(String[] args) {

		try {
			File A = new File("./src/hw7/Sample.txt");
			File B = new File("./src/hw7/Sample2.txt");

			copyFile(A, B);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void copyFile(File A, File B) throws IOException {
		try (FileInputStream fis = new FileInputStream(A);
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream(B);
				BufferedOutputStream bos = new BufferedOutputStream(fos);) {
//		FileInputStream fis = new FileInputStream(A);
//		BufferedInputStream bis= new BufferedInputStream(fis); 
//		FileOutputStream fos = new FileOutputStream(B);
//		BufferedOutputStream bos = new BufferedOutputStream(fos);

			int in = 0;

			while ((in = bis.read()) != -1) {
				bos.write(in);

			}

//		bis.close();
//		bos.close();

			System.out.println("複製完成！");
		}
	}

}
