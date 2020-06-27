package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class A {

	public static void main(String[] args) {
		
		
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(10);
		list.add("India");
		list.add("India");
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(0));
		
		System.out.println("For Loop");
		
		for (int i =0;i<list.size();i++) {
		
			System.out.println(list.get(i));
		}
		
		System.out.println("Enhanced For Loop");
		
		for(Object var:list) {
			System.out.println(var);
		}
		
		System.out.println("Iterator");
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		
	}

}
