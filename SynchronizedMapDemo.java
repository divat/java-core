package com.codemantra;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapDemo {

	public static void main(String[] params){
		Map<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(2, "Anil");
        hmap.put(44, "Ajit");
        hmap.put(1, "Brad");
        hmap.put(4, "Sachin");
        hmap.put(88, "XYZ");
        
        Map<Integer, String> map = Collections.synchronizedMap(hmap);
        
        synchronized (map) {
        	//iterate over map
		}
	}
}
