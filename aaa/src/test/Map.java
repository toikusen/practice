package test;

import java.util.HashMap;
import java.util.Random;

public class Map {

	public static void main(String[] args) {
		java.util.Map<Integer,Integer> m = new HashMap<>();
		Random random = new Random();
		for (int i= 0 ;i<10000 ;i++) {
			int r = random.nextInt(20);
			Integer freq = m.get(r);
			m.put(r, freq == null ? 1 : freq + 1); 
			              // null是則1不是則freq + 1
					}
		
		System.out.println(m);

	}

}
