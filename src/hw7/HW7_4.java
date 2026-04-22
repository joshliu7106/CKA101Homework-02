package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class HW7_4 {

	public static void main(String[] args) throws Exception {
		// 1. 建立資料夾 C:\data
		File folder = new File("C:/data");
		File file = new File(folder, "Object.ser");

		// mkdirs() 會連同所有不存在的父目錄一起建立，確保路徑一定會產生。
		if (!folder.exists()) {
			folder.mkdirs();
		}

		// 利用陣列
		// Dog[] dogs = { new Dog("小狗"), new Dog("大狗") };
		// Cat[] cats = { new Cat("小貓"), new Cat("大貓") };

		// 雖然add的是Dog和Cat，但是他們都implements Speakable所以被統一視為Speakable型態
		List<Speakable> Alist = new ArrayList<>(); // ArrayList有順序性
		Alist.add(new Cat("小貓"));
		Alist.add(new Dog("大狗"));
		Alist.add(new Dog("小狗"));
		Alist.add(new Cat("大貓"));

		try (FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos)) {

			// 陣列寫入
			// for (int i = 0; i < dogs.length; i++) {
			// oos.writeObject(dogs[i]);
			// }
			// for (Cat c : cats) {
			// oos.writeObject(c);
			// }

			// List寫入
			for (Speakable s : Alist) {
				oos.writeObject(s);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis)) {

			System.out.println(file.getName() + "檔案內容如下: ");
			System.out.println("====================");

			// 會有EOFExceptio
			while (true) {
				try {
					((Speakable) ois.readObject()).speak();

					// readObject() 必須處理 ClassNotFoundException
				} catch (ClassNotFoundException ce) {
					// 讀取物件時找不到對應的類別檔
					ce.printStackTrace();
					break;
				} catch (IOException ie) {
					System.out.println("讀取完畢");
					break;
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
