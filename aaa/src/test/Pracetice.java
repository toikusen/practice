package test;

import java.util.HashMap;

public class Pracetice {

	public static void main(String[] args) {
		
		HashMap<Integer,Integer> m = new HashMap<>();
		for (int i=0; i<24; i++) {
			int tem =  (int) (Math.random()*7);
			tem += 28;
			Integer freq = m.get(tem);
			/*if(freq == null) {
				m.put(tem, 1);
			}else {
				m.put(tem, freq+1);
			}*/
			
			m.put(tem, freq == null ? 1 : freq + 1); 
            // null是則1不是則freq + 1
		
			System.out.println(i+"點溫度:"+tem+"℃");
		}
	}

}
