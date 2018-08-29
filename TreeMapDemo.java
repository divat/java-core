package com.codemantra;

import java.util.Map;
import java.util.TreeMap;

//TreeMap implements the Map interface it is similar to HashMap.
//It's sorts the elements in ascending order of keys.
//It's an unsynchronized collection which means it is not suitable
//for thread-safe operations until unless synchronized explicitly.
public class TreeMapDemo {

	public static void main(String[] params){
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		/*Adding elements to TreeMap*/
		treeMap.put(1, "Data1");
		treeMap.put(23, "Data2");
		treeMap.put(70, "Data3");
		treeMap.put(4, "Data4");
		treeMap.put(2, "Data5");
		
		for(Map.Entry<Integer, String> entry: treeMap.entrySet()){
			System.out.print("Key is :: " +entry.getKey() + " and value is : ");
			System.out.println(entry.getValue());
		}
	}
}
