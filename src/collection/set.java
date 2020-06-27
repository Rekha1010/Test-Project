package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class set {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		Set<Object> set = new HashSet<Object>();
		set.add("Z");
		set.add("Z");
		set.add("");
		set.add("");
		set.add("");
		set.add("A");
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(26);
		set.add(25);
		set.add(27);
		set.remove(27);
		
		System.out.println(set);
		
		
		Map<String, String> map = new HashMap<String,String>();
		
		
		map.put("firstName", "Sasi");
		map.put("lastName", "VInod");
		map.put("sub", "selenium");
		map.put("location", "Hyd");
//		map.put("firstName", "India");
		
		System.out.println(map);
		
		System.out.println(map.get("lastName"));
		System.out.println(map.get("firstName"));
		
		
		Set <String>keys = map.keySet();
		
		for (String key:keys) {
			System.out.println("Key is "+key +" Value is "+ map.get(key));
			
		}
		
		
		Map<String,List<String>> map1 = new HashMap<String,List<String>>();
		
		List<String> listOfCountries = new ArrayList<String>();
		listOfCountries.add("India");
		listOfCountries.add("US");
		listOfCountries.add("UK");
		listOfCountries.add("Canada");
		listOfCountries.add("AUS");
		
		
		
		
		map1.put("Countires",listOfCountries);
		
		System.out.println("Countires are "+map1);
		
		Thread.sleep(10000);
		
		
		
		Thread.sleep(10000);
		
		
		Thread.sleep(10000);
		
		
		Thread.sleep(10000);
		
		Map<String,Map<String,String>> map2 = new HashMap<String,Map<String,String>>();
		
		
	}

}
