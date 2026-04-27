package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW8_1 {
	public static void main(String[] args) {
		List alist = new ArrayList<>();
		Object o = new Object();
		alist.add(100);
		alist.add(3.14);
		alist.add(21L);
		alist.add("100");
		alist.add(5.1);
		alist.add("Kitty");
		alist.add(100);
		alist.add(o);
		alist.add("Snoopy");
		alist.add(new BigInteger("1000"));

		System.out.println(alist);
		System.out.println(alist.size());
		System.out.println("=====================");

		// 使用Iterator
		Iterator it = alist.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// 使用forEach
//		for (Object a : alist) {
//			System.out.println(a);
//		}

		// 使用for迴圈
//		Object b = new Object();
//		for(int i = 0; i < alist.size(); i++) {
//			b = alist.get(i);
//			System.out.println(b);
//		}

		System.out.println("=====================");

		Iterator it2 = alist.iterator();
		while (it2.hasNext()) {
			Object c = it2.next();
			if (!(c instanceof Number)) {
				it2.remove();
			}else {
				System.out.println(c);
			}
		}

	}

}
