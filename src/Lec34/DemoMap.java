package Lec34;

import java.util.*;
import java.util.HashMap;

public class DemoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <String,Integer>map = new  HashMap<>();
		map.put("Ram", 80);
		map.put("Mohan", 90);
		map.put("Pooja", 75); 
		map.put("Ravi", 78);
		System.out.println(map);
		System.out.println(map.get("Mohan"));
		System.out.println(map.containsKey("Pooja"));
		//System.out.println(map.remove("Pooja"));
	//	System.out.println(map);
		 System.out.println(".............Case 1 ...........");

		 Set<String> key = map.keySet();
		 System.out.println(key);
		 for(String keys : key) {
			 System.out.println(keys+" "+map.get(keys));
		 }
		 System.out.println(".............Case 2 ...........");
		 for(String keys : map.keySet()) {
			 System.out.println(keys+" "+map.get(keys));
 
		 }
		 ArrayList<String> list = new ArrayList<String>(map.keySet());
		 
		 System.out.println(".............Case 3 ...........");
		 for(String keys : list) {
			 System.out.println(keys+" "+map.get(keys));
 
		 }
		TreeMap<String, Integer> map1 = new  TreeMap<>();
			map1.put("Ram", 80);
			map1.put("Mohan", 90);
			map1.put("Pooja", 75);
			map1.put("Ravi", 78);
			
			
		LinkedHashMap<String, Integer> map2 = new  LinkedHashMap<>();
			map2.put("Ram", 80);
			map2.put("Mohan", 90);
			map2.put("Pooja", 75);
			map2.put("Ravi", 78);
			System.out.println(map);
			System.out.println(map1);
			System.out.println(map2);

	}

}
