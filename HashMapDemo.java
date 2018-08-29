package com.codemantra;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

//HashMap implements the map interface where it is used
//to store the value using key and pair. This class makes no 
//guarantee to the order of the map. It is similar to hashtable 
//except that it is unsynchronized and permits nulls(null values and null key)
//It does not allow duplicate keys even if we add duplicate keys it will be overriden
public class HashMapDemo {

	public static void main(String[] param){
		HashMap<Integer, String> map = hashMapInsert();
		
		//Display content from map
		for(Map.Entry<Integer, String> entry : map.entrySet()){
			System.out.println("Key :: " +entry.getKey());
			System.out.println("Value :: " +entry.getValue());
		}
		
		//Get values based on key
		String value = map.get(12);
		System.out.println("Value for key 12 :: " +value);
		
		// Checking Key Existence
	    boolean flag = map.containsKey(22);
	    System.out.println("Key 22 exists in HashMap? : " + flag);
	    
	    //Checking Value Existence
	    boolean flagValue = map.containsValue("diva");
	    System.out.println("String diva exists in HashMap? : " + flagValue);
		
	    //Map sorting by keys
	    Map<Integer, String> sortKeys = new TreeMap<Integer, String>(map);
	    System.out.println("After the sorting the map by keys");
	    for(Map.Entry<Integer, String> sortmap : sortKeys.entrySet()){
	    	System.out.print(sortmap.getKey() + ":");
	    	System.out.println(sortmap.getValue());
	    }
	    
	    
	    Map<Integer, String> mapValues = sortByValues(map); 
	    System.out.println("After the sorting the map by values");
	    for(Map.Entry<Integer, String> sortmap : mapValues.entrySet()){
	    	System.out.print(sortmap.getKey() + ":");
	    	System.out.println(sortmap.getValue());
	    }
	    
	    //Remove the value based on key
	    String removedValue = map.remove(12);
	    System.out.println("Removed value :: " +removedValue);
	    
		//Remove all mappings from map
		map.clear();
		
		
	}
	
	/**
	 * Insert values into map
	 * @return
	 */
	private static HashMap<Integer, String> hashMapInsert(){
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(12, "diva");
		map.put(14, "kavi");
		map.put(17, "dfdf");
		map.put(17, "dfdf");
		map.put(17, "abcd");
		/*map.put(null, null);
		map.put(null, null);*/
		return map;
	}
	
	/**
	 * Sort the map by values
	 * @param map
	 * @return
	 */
	private static HashMap<Integer, String> sortByValues(HashMap<Integer, String> map){
		List list = new LinkedList(map.entrySet());
	       // Defined Custom Comparator here
	       Collections.sort(list, new Comparator() {
	            public int compare(Object o1, Object o2) {
	               return ((Comparable) ((Map.Entry) (o1)).getValue())
	                  .compareTo(((Map.Entry) (o2)).getValue());
	            }
	       });

	       // Here I am copying the sorted list in HashMap
	       // using LinkedHashMap to preserve the insertion order
	       HashMap sortedHashMap = new LinkedHashMap();
	       for (Iterator it = list.iterator(); it.hasNext();) {
	              Map.Entry entry = (Map.Entry) it.next();
	              sortedHashMap.put(entry.getKey(), entry.getValue());
	       } 
	       return sortedHashMap;
	}
}
