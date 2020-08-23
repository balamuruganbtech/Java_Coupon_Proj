package com.collection.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class MapExample {

	public static void main(String[] args) {

		/*
		 * IdentityHashMap<Integer, String> ihm = new IdentityHashMap<Integer,
		 * String>();
		 * ihm.put(1, "a");
		 * ihm.put(2, "b");
		 * ihm.put(3, "c");
		 * ihm.put(4, "d");
		 * // ihm.put(1, "e");
		 * System.out.println("== ---------->" + (ihm.get(1) == "a"));
		 * System.out.println("ihm--->" + ihm);
		 * WeakHashMap<Integer, String> whm = new WeakHashMap<Integer,
		 * String>();
		 * whm.put(1, "a");
		 * whm.put(2, "b");
		 * whm.put(3, "c");
		 * whm.put(4, "d");
		 * System.out.println(" equals() ---------->" + (whm.get(1) == "a"));
		 * System.out.println("whm--->" + whm);
		 */

		Map hashMap = new HashMap();
		hashMap.put("a", 1);
		hashMap.put(new String("a"), 2);
		hashMap.put("a", 3);
		System.out.println("Hash Map KeySet Size :: " + hashMap + "\t" + hashMap.keySet().size());

		Map identityMap = new IdentityHashMap();
		identityMap.put("b", 1);
		identityMap.put(new String("a"), 2);
		identityMap.put("a", 3);
		System.out.println("Identity Map KeySet Size :: " + identityMap + "\t" + identityMap.keySet().size());
		
		Map testMap = new HashMap();
		for(int i=0;i<50;i++){
			
			if(/*i==12 || i==24 || i==34 ||*/ i==49){
				
				System.out.println("lock");
				/*try {
					Thread.sleep(10000);
				}
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
			}
			testMap.put(i, i);
		}

	}
}
