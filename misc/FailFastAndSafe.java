package com.misc;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastAndSafe {

	public static void main(String[] args) {
		List<String> al = new CopyOnWriteArrayList<>();
		al.add("bala");
		al.add("ramya");
		al.add("siva");
		al.add("dani");
		al.add("murugan");
		
		al.remove(1);
		System.out.println(al);
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			String value=itr.next();
			if(value.equals("bala")){
				al.remove(0);
//				itr.remove();
			}
		}
		System.out.println(al);
	}

}
