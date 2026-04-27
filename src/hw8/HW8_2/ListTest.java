package hw8.HW8_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		
		List<Train> train = new ArrayList<Train>();
		
		train.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		train.add(new Train(1254, "區間", "屏東", "基隆", 700));
		train.add(new Train(118, "自強", "高雄", "台北", 500));
		train.add(new Train(1288, "區間", "新竹", "基隆", 400));
		train.add(new Train(122, "自強", "台中", "花蓮", 600));
		train.add(new Train(1222, "區間", "樹林", "七堵", 300));
		train.add(new Train(1254, "區間", "屏東", "基隆", 700));
		
		Collections.sort(train);
		
//		for(Train t : train) {
//			System.out.println(t);
//		}
		
		Iterator it = train.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		for(int i = 0; i < train.size(); i++) {
//			Train t = train.get(i);
//			System.out.println("班次：" + t.getNumber() + " 車種：" + t.getType() + " 出發地：" + t.getStart() + " 目的地："
//					+ t.getDest() + " 票價：" + t.getPrice());
			
//			System.out.println(train.get(i));
//		}
		
		
		
		
	}

}
