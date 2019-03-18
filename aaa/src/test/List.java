package test;

import java.util.ArrayList;
import java.util.Random;

public class List {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		java.util.List<Integer>list = new ArrayList<>();
		
		for (int a =0; a<20; a++) {
			list.add(0);
		}
		
		for (int i =0; i<10000;i++) {
			int r = random.nextInt(20);
			Integer freq = list.get(r);
			list.set(r, freq+1);
		}
		
			System.out.println(list);
	}

}
