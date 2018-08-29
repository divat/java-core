package com.codemantra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedListDemo {

	public static void main(String[] params){
		List<String> list = new ArrayList<String>();

		//Adding elements to synchronized ArrayList
		list.add("Pen");
		list.add("NoteBook");
		list.add("Ink");
		
		List<String> synchronizedList = Collections.synchronizedList(list);
		
		synchronized (synchronizedList) {
			for(String s : synchronizedList){
				System.out.println(s);
			}
		}
	}
}
